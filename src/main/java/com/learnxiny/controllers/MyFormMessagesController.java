package com.learnxiny.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.learnxiny.mocks.CheckMyFormMocks;
import com.learnxiny.models.*;
import com.learnxiny.mongorepository.CounterRepository;
import com.learnxiny.mongorepository.FormMessageReplyRepository;
import com.learnxiny.mongorepository.FormMessageRepository;
import com.learnxiny.mongorepository.TrainerInfoRepository;
import com.learnxiny.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by spandhare on 3/19/16.
 */
@RestController
public class MyFormMessagesController {
    @Autowired
    private FormMessageRepository formMessageRepository;

    @Autowired
    private FormMessageReplyRepository formMessageReplyRepository;

    @Autowired
    TrainerInfoRepository trainerInfoRepository;

    @Autowired
    private CounterService counterService;

    @RequestMapping(value = "/messages",  method = RequestMethod.POST)
    public FormMessage postFormMessage(@RequestBody String jsonString) {
        Gson gson = new GsonBuilder().serializeNulls().create();
        FormMessage formMessage =  gson.fromJson(jsonString, FormMessage.class);

        if (formMessage != null) {
            formMessage.setId(Long.toString(counterService.getNextSequence("form_messages")));

            if (StringUtils.isEmpty(formMessage.getTimeStamp())) {
                formMessage.setTimeStamp(Long.toString(System.currentTimeMillis()));
            }
        }

        formMessageRepository.save(formMessage);
        return formMessage;
    }

    @RequestMapping(value = "/messages",  method = RequestMethod.GET)
    public List<FormMessage> messages() {

        List<FormMessage> formMessages = formMessageRepository.findAll();

        for(FormMessage formMessage: formMessages) {

            List<FormMessageReply> formMessageReplies =
                    formMessageReplyRepository.findAllByMessageId(formMessage.getId());

            if (formMessageReplies == null || formMessageReplies.size() == 0) {
                formMessage.setNumberOfReplies("0");
            } else {
                formMessage.setNumberOfReplies(Integer.toString(formMessageReplies.size()));
            }
        }
        Collections.sort(formMessages, new Comparator<FormMessage>() {
            @Override
            public int compare(FormMessage o1, FormMessage o2) {
                return (int) (Long.parseLong(o2.getTimeStamp()) -
                        Long.parseLong(o1.getTimeStamp()));
            }
        });

        return formMessages;
    }

    @RequestMapping(value = "/messages/reset",  method = RequestMethod.POST)
    public void refreshFormMessage() {
        formMessageRepository.deleteAll();
        counterService.reset("form_messages");
    }

    @RequestMapping(value = "/messages/{messageId}/reply",  method = RequestMethod.POST)
    public FormMessageReply postFormMessageReply(@PathVariable(value="messageId") String messageId,
                                                 @RequestBody String jsonString) {
        Gson gson = new GsonBuilder().serializeNulls().create();
        FormMessageReply formMessageReply =  gson.fromJson(jsonString, FormMessageReply.class);

        if (formMessageReply != null) {
            formMessageReply.setId(Long.toString(counterService.getNextSequence("form_message_replies")));

            if (StringUtils.isEmpty(formMessageReply.getTimeStamp())) {
                formMessageReply.setTimeStamp(Long.toString(System.currentTimeMillis()));
            }

            //TODO check of existence of message id
            formMessageReply.setMessageId(messageId);
        }

        formMessageReplyRepository.save(formMessageReply);
        return formMessageReply;
    }

    @RequestMapping(value = "/messages/{messageId}/replies",  method = RequestMethod.GET)
    public List<TrainerReply> replies(@PathVariable(value="messageId") String messageId) {

        List<FormMessageReply> formMessageReplies = formMessageReplyRepository.findAllByMessageId(messageId);

        List<TrainerReply> trainerReplies = new ArrayList<TrainerReply>();

        for (FormMessageReply formMessageReply: formMessageReplies) {
            TrainerReply trainerReply = new TrainerReply();

            trainerReply.setFormMessageReply(formMessageReply);
            Trainer trainer = trainerInfoRepository.findOne(formMessageReply.getTrainerId());
            trainerReply.setTrainer(trainer);

            trainerReplies.add(trainerReply);
        }

        Collections.sort(trainerReplies, new Comparator<TrainerReply>() {
            @Override
            public int compare(TrainerReply o1, TrainerReply o2) {
                return (int) (Long.parseLong(o2.getFormMessageReply().getTimeStamp()) -
                        Long.parseLong(o1.getFormMessageReply().getTimeStamp()));
            }
        });

        return trainerReplies;
    }

    @RequestMapping(value = "/replies/reset",  method = RequestMethod.POST)
    public void resetFormMessageReplies() {
        formMessageReplyRepository.deleteAll();
        counterService.reset("form_message_replies");
    }
}
package com.learnxiny.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.learnxiny.mocks.CheckMyFormMocks;
import com.learnxiny.models.Counter;
import com.learnxiny.models.FitnessForm;
import com.learnxiny.models.FormMessage;
import com.learnxiny.mongorepository.CounterRepository;
import com.learnxiny.mongorepository.FormMessageRepository;
import com.learnxiny.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by spandhare on 3/19/16.
 */
@RestController
public class MyFormMessagesController {
    @Autowired
    private FormMessageRepository formMessageRepository;

    @Autowired
    private CounterRepository counterRepository;

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
        return formMessageRepository.findAll();
    }

    @RequestMapping(value = "/messages/refresh",  method = RequestMethod.POST)
    public void refreshFormMessage() {
        formMessageRepository.deleteAll();
        counterService.reset("form_messages");
    }
}

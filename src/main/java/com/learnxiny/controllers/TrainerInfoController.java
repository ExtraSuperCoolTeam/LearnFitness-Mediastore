package com.learnxiny.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.learnxiny.mocks.ContentMocks;
import com.learnxiny.models.Trainer;
import com.learnxiny.models.TrainerLocation;
import com.learnxiny.models.TrainerParam;
import com.learnxiny.mongorepository.TrainerInfoRepository;
import com.learnxiny.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TrainerInfoController {

    @Autowired
    TrainerInfoRepository trainerInfoRepository;

    @Autowired
    private CounterService counterService;

    @RequestMapping(value = "/trainers/{trainerId}",  method = RequestMethod.GET)
    public Trainer fetchTrainerById(@PathVariable(value="trainerId") String trainerId) {

//        TrainerParam trainerParam = new TrainerParam("Lifting", "5", "6'1", "200 lbs" );
//        TrainerLocation trainerLocation1 = new TrainerLocation("37.77375569999999", "-122.4026382");
//
//        final Trainer trainer = new Trainer("The Rock",
//                "220, California st, San Francisco, CA 94111", "(415)955-1919",
//                "http://www.picpicx.com/wp-content/uploads/2014/09/790f3003f274a217a2ebc4cfdda3d4f4.png?63bea7",
//                trainerParam, trainerLocation1);
        return trainerInfoRepository.findOne(trainerId);
    }

    @RequestMapping(value = "/trainers",  method = RequestMethod.GET)
    public List<Trainer> fetchTrainers() {
        //return ContentMocks.getTrainers();
        return trainerInfoRepository.findAll();
    }

    @RequestMapping(value = "/trainers",  method = RequestMethod.POST)
    public Trainer postTrainer(@RequestBody String jsonString) {
        Gson gson = new GsonBuilder().serializeNulls().create();
        Trainer trainer = gson.fromJson(jsonString, Trainer.class);

        if (trainer != null) {
            trainer.setId(Long.toString(counterService.getNextSequence("trainers")));
        }

        trainerInfoRepository.save(trainer);

        return trainer;
    }

    @RequestMapping(value = "/trainers/reset",  method = RequestMethod.POST)
    public void refreshFormMessage() {
        trainerInfoRepository.deleteAll();
        counterService.reset("trainers");
    }
}

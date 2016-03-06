package com.learnxiny.controllers;

import com.learnxiny.mocks.ContentMocks;
import com.learnxiny.models.Trainer;
import com.learnxiny.models.TrainerLocation;
import com.learnxiny.models.TrainerParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping("/trainers")
public class TrainerInfoController {

    @RequestMapping(value = "/trainers/{trainerId}",  method = RequestMethod.GET)
    public Trainer fetchTrainerById(@PathVariable(value="trainerId") String trainerId) {
//
//        Map<String, String> trainerParams = new HashMap<String, String>();
//        trainerParams.put("Height", "6'1");
//        trainerParams.put("Weight", "200 lbs");
//        trainerParams.put("Yrs of Training", "5");
//        trainerParams.put("Speciality", "Lifting");


        TrainerParam trainerParam = new TrainerParam("Lifting", "5", "6'1", "200 lbs" );
        TrainerLocation trainerLocation1 = new TrainerLocation("37.77375569999999", "-122.4026382");

        final Trainer trainer = new Trainer("1", "The Rock",
                "220, California st, San Francisco, CA 94111", "(415)955-1919",
                "http://www.picpicx.com/wp-content/uploads/2014/09/790f3003f274a217a2ebc4cfdda3d4f4.png?63bea7",
                trainerParam, trainerLocation1);
        return trainer;
    }

    @RequestMapping(value = "/trainers",  method = RequestMethod.GET)
    public List<Trainer> fetchTrainers() {
        return ContentMocks.getTrainers();
    }
}

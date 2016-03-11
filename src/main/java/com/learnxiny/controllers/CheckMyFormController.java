package com.learnxiny.controllers;

import com.learnxiny.mocks.CheckMyFormMocks;
import com.learnxiny.models.FitnessForm;
import com.learnxiny.models.Trainer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by spandhare on 3/10/16.
 */
@RestController
public class CheckMyFormController {
    @RequestMapping(value = "/forms",  method = RequestMethod.POST)
    public FitnessForm postFitnessForm(@RequestBody FitnessForm fitnessForm) {
        return CheckMyFormMocks.createFitnessForm(fitnessForm);
    }

    @RequestMapping(value = "/forms",  method = RequestMethod.GET)
    public List<FitnessForm> forms() {
        return CheckMyFormMocks.getFitnessFormsHardcoded();
    }
}

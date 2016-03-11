package com.learnxiny.mocks;

import com.learnxiny.models.FitnessForm;
import com.learnxiny.models.Trainer;
import com.learnxiny.models.TrainerLocation;
import com.learnxiny.models.TrainerParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by spandhare on 3/10/16.
 */
public class CheckMyFormMocks {

    private static long formId;
    static List<FitnessForm> fitnessForms = new ArrayList<FitnessForm>();

    public static FitnessForm createFitnessForm(FitnessForm fitnessForm) {
        fitnessForm.setId(Long.toString(formId++));
        fitnessForms.add(fitnessForm);

        return fitnessForm;

    }

    public static List<FitnessForm> getFitnessForms() {
        return fitnessForms;
    }

    public static List<FitnessForm> getFitnessFormsHardcoded() {
        List<FitnessForm> fitnessForms = new ArrayList<FitnessForm>();

        TrainerParam trainerParam = new TrainerParam("Lifting", "5", "6'1", "200 lbs" );
        TrainerLocation trainerLocation1 = new TrainerLocation("37.77375569999999", "-122.4026382");


        final Trainer trainer1 = new Trainer("1", "The Rock",
                "220, California st, San Francisco, CA 94111", "(415)955-1919",
                "http://i.dailymail.co.uk/i/pix/2015/05/10/02/2882448100000578-3075270-image-m-48_1431220845465.jpg",
                trainerParam, trainerLocation1);

        FitnessForm f = new FitnessForm("1", "https://www.youtube.com/watch?v=HeHbt6eAEb8", "hello","1");
        f.setId("1");
        fitnessForms.add(f);

        return fitnessForms;
    }

}

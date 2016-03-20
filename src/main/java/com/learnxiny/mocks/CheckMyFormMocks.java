package com.learnxiny.mocks;

import com.learnxiny.models.FitnessForm;
import com.learnxiny.models.Trainer;
import com.learnxiny.models.TrainerLocation;
import com.learnxiny.models.TrainerParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * Created by spandhare on 3/10/16.
 */
public class CheckMyFormMocks {

    private static long formId;
    static List<FitnessForm> fitnessForms = new ArrayList<FitnessForm>();

    public static FitnessForm createFitnessForm(FitnessForm fitnessForm) {

        UUID uuid = UUID.randomUUID();

        fitnessForm.setId(uuid.toString());
        fitnessForm.setFeedback("Keep core tight, breath in and breath out, focus!");
        fitnessForms.add(fitnessForm);

        return fitnessForm;

    }

    public static List<FitnessForm> getFitnessForms() {

        if (fitnessForms.size() == 0) {
            fitnessForms.addAll(getFitnessFormsHardcoded());
        }
        return fitnessForms;
    }

    public static List<FitnessForm> getFitnessFormsHardcoded() {
        List<FitnessForm> fitnessForms = new ArrayList<FitnessForm>();

        TrainerParam trainerParam = new TrainerParam("Lifting", "5", "6'1", "200 lbs" );
        TrainerLocation trainerLocation1 = new TrainerLocation("37.77375569999999", "-122.4026382");


//        final Trainer trainer1 = new Trainer("The Rock",
//                "220, California st, San Francisco, CA 94111", "(415)955-1919",
//                "http://i.dailymail.co.uk/i/pix/2015/05/10/02/2882448100000578-3075270-image-m-48_1431220845465.jpg",
//                "bigman", trainerParam, trainerLocation1);

        FitnessForm f = new FitnessForm("1","hello", "hello again", "HeHbt6eAEb8", "squats", "1");
        FitnessForm f2 = new FitnessForm("1","help on squats", "chest out", "HeHbt6eAEb8", "squats", "1");
        FitnessForm f3 = new FitnessForm("1","Cant do push ups", "keep elbows in", "HeHbt6eAEb8", "squats", "1");
        FitnessForm f4 = new FitnessForm("1","back hurting", "Do not arch", "HeHbt6eAEb8", "squats", "1");

        f.setId("1");
        f2.setId("2");
        f3.setId("3");
        f4.setId("4");

        fitnessForms.add(f);
        fitnessForms.add(f2);
        fitnessForms.add(f3);
        fitnessForms.add(f4);

        return fitnessForms;
    }

}

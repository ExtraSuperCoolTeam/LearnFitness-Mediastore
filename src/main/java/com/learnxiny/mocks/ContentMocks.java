package com.learnxiny.mocks;

import com.learnxiny.models.*;

import java.util.ArrayList;
import java.util.List;

public class ContentMocks {

    public static Content getContent() {

        final Step step1 = new Step("1", "http://tonygentilcore.com/wp-content/uploads/2016/02/Nancy-Pushup-1.png",
        "Start postion", "Keep core tight and take deep breath");

        final Step step2 = new Step("2", "http://tonygentilcore.com/wp-content/uploads/2016/02/Nancy-Pushup-2.png",
        "Go down", "Go down keeping correct form");

        final Step step3 = new Step("3", "http://tonygentilcore.com/wp-content/uploads/2016/02/Nancy-Pushup-head-back.png",
        "Head back", "Keep tight");

        List<Step> steps = new ArrayList<Step>(){{
            add(step1);
            add(step2);
            add(step3);
        }};


        final Week week1 = new Week("Squat jacks 1", "1",
                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg", "" +
                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
                steps);


        final Week week2 = new Week("Squat jacks 2", "2",
                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg","" +
                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
                steps);

        final Week week3 = new Week("Squat jacks 3", "3",
                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg","" +
                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
                steps);

        final Week week4 = new Week("Squat jacks 4", "4",
                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg","" +
                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
                steps);

        final Week week5 = new Week("Squat jacks 5", "5",
                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg","" +
                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
                steps);

        final Week week6 = new Week("Squat jacks 6", "6",
                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg","" +
                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
                steps);

        final Week week7 = new Week("Squat jacks 7", "7",
                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg","" +
                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
                steps);

        final Week week8 = new Week("Squat jacks 8", "8",
                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg","" +
                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
                steps);


        List<Week> weeks = new ArrayList<Week>(){{
            add(week1);
            add(week2);
            add(week3);
            add(week4);
            add(week5);
            add(week6);
            add(week7);
            add(week8);
        }};
        Content content = new Content("Coordination, Agility & Balance Workouts",
                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
                "8", weeks);

        return content;

    }

    public static List<Trainer> getTrainers() {

        TrainerParam trainerParam = new TrainerParam("Lifting", "5", "6'1", "200 lbs" );
        TrainerLocation trainerLocation1 = new TrainerLocation("37.77375569999999", "-122.4026382");
        TrainerLocation trainerLocation2 = new TrainerLocation("37.77492840000001", "-122.4015604");
        TrainerLocation trainerLocation3 = new TrainerLocation("37.769657", "-122.4070059");

        final Trainer trainer1 = new Trainer("1", "The Rock",
                "220, California st, San Francisco, CA 94111", "(415)955-1919",
                "http://www.picpicx.com/wp-content/uploads/2014/09/790f3003f274a217a2ebc4cfdda3d4f4.png?63bea7",
                trainerParam, trainerLocation1);

        final Trainer trainer2 = new Trainer("2", "Mr IWillMakeYouFit",
                "220, California st, San Francisco, CA 94111", "(415)955-1919",
                "http://www.picpicx.com/wp-content/uploads/2014/09/790f3003f274a217a2ebc4cfdda3d4f4.png?63bea7",
                trainerParam, trainerLocation2);

        final Trainer trainer3 = new Trainer("3", "The Lifter",
                "220, California st, San Francisco, CA 94111", "(415)955-1919",
                "http://www.picpicx.com/wp-content/uploads/2014/09/790f3003f274a217a2ebc4cfdda3d4f4.png?63bea7",
                trainerParam, trainerLocation3);

        List<Trainer> trainers = new ArrayList<Trainer>() {{
            add(trainer1);
            add(trainer2);
            add(trainer3);
        }};

        return trainers;
    }
}

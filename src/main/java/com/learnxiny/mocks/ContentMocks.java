package com.learnxiny.mocks;

import com.learnxiny.models.*;

import java.util.ArrayList;
import java.util.List;

public class ContentMocks {

//    public static Content getContent() {
//
//        final Step step1 = new Step("1", "http://tonygentilcore.com/wp-content/uploads/2016/02/Nancy-Pushup-1.png",
//        "Start postion", "Keep core tight and take deep breath");
//
//        final Step step2 = new Step("2", "http://tonygentilcore.com/wp-content/uploads/2016/02/Nancy-Pushup-2.png",
//        "Go down", "Go down keeping correct form");
//
//        final Step step3 = new Step("3", "http://tonygentilcore.com/wp-content/uploads/2016/02/Nancy-Pushup-head-back.png",
//        "Head back", "Keep tight");
//
//        List<Step> steps = new ArrayList<Step>(){{
//            add(step1);
//            add(step2);
//            add(step3);
//        }};
//
//
//        final Week week1 = new Week("Squat jacks 1", "1",
//                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
//                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg", "" +
//                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
//                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
//                steps);
//
//
//        final Week week2 = new Week("Squat jacks 2", "2",
//                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
//                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg","" +
//                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
//                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
//                steps);
//
//        final Week week3 = new Week("Squat jacks 3", "3",
//                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
//                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg","" +
//                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
//                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
//                steps);
//
//        final Week week4 = new Week("Squat jacks 4", "4",
//                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
//                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg","" +
//                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
//                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
//                steps);
//
//        final Week week5 = new Week("Squat jacks 5", "5",
//                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
//                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg","" +
//                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
//                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
//                steps);
//
//        final Week week6 = new Week("Squat jacks 6", "6",
//                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
//                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg","" +
//                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
//                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
//                steps);
//
//        final Week week7 = new Week("Squat jacks 7", "7",
//                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
//                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg","" +
//                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
//                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
//                steps);
//
//        final Week week8 = new Week("Squat jacks 8", "8",
//                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
//                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg","" +
//                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
//                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
//                steps);
//
//
//        List<Week> weeks = new ArrayList<Week>(){{
//            add(week1);
//            add(week2);
//            add(week3);
//            add(week4);
//            add(week5);
//            add(week6);
//            add(week7);
//            add(week8);
//        }};
//        Content content = new Content("Coordination, Agility & Balance Workouts",
//                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
//                "8", weeks);

    public static Content getContent() {

        final Step step1 = new Step("1", "http://imgur.com/0j0MuhT.jpg",
                "Start postion", "Keep core tight and take deep breath");

        final Step step2 = new Step("2", "http://imgur.com/z0RwMnt.jpg  ",
                "Go down", "Go down keeping correct form");

        final Step step3 = new Step("3", "http://tonygentilcore.com/wp-content/uploads/2016/02/Nancy-Pushup-head-back.png",
                "Head back", "Keep tight");

        List<Step> steps = new ArrayList<Step>(){{
            add(step1);
            add(step2);
            add(step3);
        }};

        //Week 1
        final Step week1Step1 = new Step("1", "http://imgur.com/0j0MuhT.jpg",
                "Start postion", "Push single cable from chest level, forward and slightly down");

        final Step week1Step2 = new Step("2", "http://imgur.com/z0RwMnt.jpg",
                "Go down", "Simultaneously descend into partial split squat");

        final Step week1Step3 = new Step("3", "http://imgur.com/Q35G2OK.jpg",
                "Head back", "Maintain neutral spine whilst allowing trunk rotation ");

        List<Step> week1Steps = new ArrayList<Step>(){{
            add(week1Step1);
            add(week1Step2);
            add(week1Step3);
        }};

        final Week week1 = new Week("HIIT Cardio and Body Strength", "1",
                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
                "https://youtu.be/Cn8Elmw16ZU", "Cn8Elmw16ZU", "" +
                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
                week1Steps);


        //Week 2
        final Step week2Step1 = new Step("1", "http://imgur.com/lOkqVSg.jpg",
                "Start postion", "Pull mid-cable to alternate sides");

        final Step week2Step2 = new Step("2", "http://imgur.com/JWVEiXB.jpg",
                "Go down", "Simultaneously take a large step back - knee travels over 2nd toe");

        final Step week2Step3 = new Step("3", "http://imgur.com/jWQjvDD.jpg",
                "Head back", " Alternate legs ");

        List<Step> week2Steps = new ArrayList<Step>(){{
            add(week2Step1);
            add(week2Step2);
            add(week2Step3);
        }};


        final Week week2 = new Week("Calorie burning cardio and upper body strength", "2",
                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
                "https://youtu.be/E_J6CntJXyQ", "E_J6CntJXyQ","" +
                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
                week2Steps);

        //Week 3

        final Step week3Step1 = new Step("1", "http://imgur.com/akVaOxt.jpg",
                "Start postion", "Move each cable through a transverse arc with a reciprocal action");

        final Step week3Step2 = new Step("2", "http://imgur.com/org0qG9.jpg",
                "Go down", "Simultaneously descend into weight-shifting squat in same direction");

        final Step week3Step3 = new Step("3", "http://imgur.com/org0qG9.jpg",
                "Head back", "Feel gentle stretch in inner thigh of trailing leg");

        List<Step> week3Steps = new ArrayList<Step>(){{
            add(week3Step1);
            add(week3Step2);
            add(week3Step3);
        }};

        final Week week3 = new Week(" HIIT, Core, and Pilates Burnout", "3",
                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
                "https://youtu.be/M2pfvVdk6N0", "M2pfvVdk6N0","" +
                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
                week3Steps);

        //week 4

        final Step week4Step1 = new Step("1", "http://imgur.com/org0qG9.jpg",
                "Start postion", "Begin with cables high and central - with arms crossed over");

        final Step week4Step2 = new Step("2", "http://imgur.com/qwkwwNt.jpg",
                "Go down", "Arc cables back and down to low and wide");

        final Step week4Step3 = new Step("3", "http://imgur.com/W7rmtxd.jpg",
                "Head back", "Release slowly with chest high whilst descending back into squat ");

        List<Step> week4Steps = new ArrayList<Step>(){{
            add(week4Step1);
            add(week4Step2);
            add(week4Step3);
        }};


        final Week week4 = new Week("Cardio, Upper Body, and Yoga", "4",
                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
                "https://youtu.be/gDc97d3Fmfc", "gDc97d3Fmfc","" +
                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
                week4Steps);

        //Week 5


        final Step week5Step1 = new Step("1", "http://imgur.com/W7rmtxd.jpg",
                "Start postion", "Sit back into the squat and maintain neutral spine");

        final Step week5Step2 = new Step("2", "http://imgur.com/v9dract.jpg",
                "Go down", "Drop into 1/4 squat before extending hips and knees");

        final Step week5Step3 = new Step("3", "http://imgur.com/KoYTETw.jpg",
                "Head back", "Come up onto toes whilst pushing dubmbbells fully overhead");

        List<Step> week5Steps = new ArrayList<Step>(){{
            add(week5Step1);
            add(week5Step2);
            add(week5Step3);
        }};


        final Week week5 = new Week("HIIT and Lower Body", "5",
                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
                "https://youtu.be/tMB_ehaXtbI", "tMB_ehaXtbI","" +
                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
                week5Steps);

//        final Week week6 = new Week("Squat jacks 6", "6",
//                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
//                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg","" +
//                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
//                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
//                steps);
//
//        final Week week7 = new Week("Squat jacks 7", "7",
//                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
//                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg","" +
//                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
//                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
//                steps);
//
//        final Week week8 = new Week("Squat jacks 8", "8",
//                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
//                "https://youtu.be/D9BC884dIDg", "D9BC884dIDg","" +
//                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
//                "Part of true fitness is not only that you have good cardiovascular endurance and that you are strong but also that your body is capable of doing many different motions with ease and is capable of moving from one motion to another with only a small learning curve. Being truly fit is knowing what your body is capable of before you even attempt it and having trained your body to the point where it can become accustomed to a new exercise/motion in a very short amount of time.",
//                steps);


        List<Week> weeks = new ArrayList<Week>(){{
            add(week1);
            add(week2);
            add(week3);
            add(week4);
            add(week5);
//            add(week6);
//            add(week7);
//            add(week8);
        }};
        Content content = new Content("Strong and lean body workout - Fitness Blender",
                "http://gumbofitness.com/wp-content/uploads/2014/11/header-photo1.jpg",
                "5", weeks);

        return content;

    }

    public static List<Trainer> getTrainers() {

//        TrainerParam trainerParam = new TrainerParam("Lifting", "5", "6'1", "200 lbs" );
//        TrainerLocation trainerLocation1 = new TrainerLocation("37.77375569999999", "-122.4026382");
//        TrainerLocation trainerLocation2 = new TrainerLocation("37.77492840000001", "-122.4015604");
//        TrainerLocation trainerLocation3 = new TrainerLocation("37.769657", "-122.4070059");
//
//        final Trainer trainer1 = new Trainer("1", "The Rock",
//                "220, California st, San Francisco, CA 94111", "(415)955-1919",
//                "http://i.dailymail.co.uk/i/pix/2015/05/10/02/2882448100000578-3075270-image-m-48_1431220845465.jpg",
//                trainerParam, trainerLocation1);
//
//        final Trainer trainer2 = new Trainer("2", "Mr IWillMakeYouFit",
//                "220, California st, San Francisco, CA 94111", "(415)955-1919",
//                "http://i.dailymail.co.uk/i/pix/2015/05/10/02/2882448100000578-3075270-image-m-48_1431220845465.jpg",
//                trainerParam, trainerLocation2);
//
//        final Trainer trainer3 = new Trainer("3", "The Lifter",
//                "220, California st, San Francisco, CA 94111", "(415)955-1919",
//                "http://i.dailymail.co.uk/i/pix/2015/05/10/02/2882448100000578-3075270-image-m-48_1431220845465.jpg",
//                trainerParam, trainerLocation3);
//
//        List<Trainer> trainers = new ArrayList<Trainer>() {{
//            add(trainer1);
//            add(trainer2);
//            add(trainer3);
//        }};


        TrainerParam trainerParam1 = new TrainerParam("Lifting", "5", "6'1", "200 lbs" );
        TrainerParam trainerParam2 = new TrainerParam("Cardio", "5", "6'1", "200 lbs" );
        TrainerParam trainerParam3 = new TrainerParam("Cross Fit", "5", "6'1", "200 lbs" );
        TrainerLocation trainerLocation1 = new TrainerLocation("37.773780", "-122.402717");
        TrainerLocation trainerLocation2 = new TrainerLocation("37.769668", "-122.406936");
        TrainerLocation trainerLocation3 = new TrainerLocation("37.774934", "-122.401561");

        final Trainer trainer1 = new Trainer("1", "The Rock",
                "766 Brannan Street. San Francisco, CA 94103", "(415)863-3935",
                "http://starschanges.com/wp-content/uploads/2015/06/The-Rock-dwayne-the-rock-johnson-33694572-500-562.jpg",
                trainerParam1, trainerLocation1);

        final Trainer trainer2 = new Trainer("2", " Arnold Schwarzenegger",
                "1001 Brannan Street. San Francisco, CA 94103", "(415)348-6377",
                "http://cms.bbcomcdn.com/fun/images/2014/arnold-schwarzeneggers-8-best-training-principles-musclepharm-arnold-series-graphic-1.jpg",
                trainerParam2, trainerLocation2);

        final Trainer trainer3 = new Trainer("3", "Bruce Wayne",
                "586 6th Street. San Francisco, CA 94103", "(415)483-2926",
                "http://images6.fanpop.com/image/photos/32400000/Bruce-Wayne-bruce-wayne-32411252-967-1450.jpg",
                trainerParam3, trainerLocation3);

        List<Trainer> trainers = new ArrayList<Trainer>() {{
            add(trainer1);
            add(trainer2);
            add(trainer3);
        }};
        return trainers;
    }
}

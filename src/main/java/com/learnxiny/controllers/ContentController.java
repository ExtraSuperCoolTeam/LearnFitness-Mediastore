package com.learnxiny.controllers;

import com.learnxiny.models.Content;
import com.learnxiny.models.Week;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by spandhare on 3/1/16.
 */

@RestController
public class ContentController {

    @RequestMapping("/contents")
    public Content contents() {
        final Week week1 = new Week("Squat jacks", "1", "",
                "https://youtu.be/D9BC884dIDg?list=PL5lPziO_t_Vjq5bzvW1HrEE3gnnySBn5w","" +
                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp","" +
                "Train like an Athlete Interval Training - At Home Cardio and Toning Boot Camp");

        List<Week> weeks = new ArrayList<Week>(){{
            add(week1);
        }};
        Content content = new Content("Coordination, Agility & Balance Workouts", "1", weeks);

        return content;
    }
}

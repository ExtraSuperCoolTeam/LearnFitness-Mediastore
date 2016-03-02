package com.learnxiny.models;

import java.util.List;

/**
 * Created by spandhare on 3/1/16.
 */
public class Content {
    String title;
    String numberOfWeeks;
    List<Week> weeks;

    public Content(String title, String numberOfWeeks, List<Week> weeks) {
        this.title = title;
        this.numberOfWeeks = numberOfWeeks;
        this.weeks = weeks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNumberOfWeeks() {
        return numberOfWeeks;
    }

    public void setNumberOfWeeks(String numberOfWeeks) {
        this.numberOfWeeks = numberOfWeeks;
    }

    public List<Week> getWeeks() {
        return weeks;
    }

    public void setWeeks(List<Week> weeks) {
        this.weeks = weeks;
    }
}

package com.learnxiny.models;

import java.util.List;

public class Content {
    String title;
    String imageUrl;
    String numberOfWeeks;
    List<Week> weeks;

    public Content(String title, String imageUrl,  String numberOfWeeks, List<Week> weeks) {
        this.title = title;
        this.numberOfWeeks = numberOfWeeks;
        this.weeks = weeks;
        this.imageUrl = imageUrl;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

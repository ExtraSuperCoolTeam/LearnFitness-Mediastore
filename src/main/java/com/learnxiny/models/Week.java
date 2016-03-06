package com.learnxiny.models;

import java.util.List;

public class Week {

    String weekTitle;
    String weekNumber;
    String photoUrl;
    String videoUrl;
    String videoId;
    String shortDescription;
    String longDescription;

    List<Step> steps;

    public Week(String weekTitle, String weekNumber, String photoUrl, String videoUrl, String videoId,
                String shortDescription, String longDescription, List<Step> steps) {
        this.weekTitle = weekTitle;
        this.weekNumber = weekNumber;
        this.photoUrl = photoUrl;
        this.videoUrl = videoUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.steps = steps;
    }

    public String getWeekTitle() {
        return weekTitle;
    }

    public void setWeekTitle(String weekTitle) {
        this.weekTitle = weekTitle;
    }

    public String getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(String weekNumber) {
        this.weekNumber = weekNumber;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }
}

package com.learnxiny.models;


import org.springframework.data.annotation.Id;

/**
 * Created by spandhare on 3/10/16.
 */
public class FitnessForm {

    @Id
    String id;
    String trainerId;
    String message = "";
    String feedback = "";
    String videoId;
    String weekTitle;
    String weekNumber;

    public FitnessForm() {

    }

    public FitnessForm(String trainerId, String message, String feedback, String videoId, String weekTitle, String weekNumber) {
        this.trainerId = trainerId;
        this.message = message;
        this.feedback = feedback;
        this.videoId = videoId;
        this.weekTitle = weekTitle;
        this.weekNumber = weekNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(String weekNumber) {
        this.weekNumber = weekNumber;
    }

    public String getWeekTitle() {
        return weekTitle;
    }

    public void setWeekTitle(String weekTitle) {
        this.weekTitle = weekTitle;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

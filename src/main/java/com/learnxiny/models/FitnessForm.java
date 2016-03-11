package com.learnxiny.models;


import org.springframework.data.annotation.Id;

/**
 * Created by spandhare on 3/10/16.
 */
public class FitnessForm {

    @Id
    String id;
    String trainerId;
    String comment;
    String videoUrl;

    public FitnessForm() {

    }

    public FitnessForm(String id, String comment, String videoUrl, String trainerId ) {
        this.id = id;
        this.trainerId = trainerId;
        this.comment = comment;
        this.videoUrl = videoUrl;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}

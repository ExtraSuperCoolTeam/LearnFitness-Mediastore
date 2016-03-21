package com.learnxiny.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by spandhare on 3/19/16.
 */

@Document(collection = "form_messages")
public class FormMessage {
    @Id String id;
    String message = "";
    String videoId;
    String weekTitle;
    String weekNumber;
    String timeStamp;
    String numberOfReplies;

    public FormMessage(String message, String videoId, String weekTitle, String weekNumber, String timeStamp) {
        this.message = message;
        this.videoId = videoId;
        this.weekTitle = weekTitle;
        this.weekNumber = weekNumber;
        this.timeStamp = timeStamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
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

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getNumberOfReplies() {
        return numberOfReplies;
    }

    public void setNumberOfReplies(String numberOfReplies) {
        this.numberOfReplies = numberOfReplies;
    }
}

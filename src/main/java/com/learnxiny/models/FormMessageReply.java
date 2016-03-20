package com.learnxiny.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by spandhare on 3/20/16.
 */
@Document(collection = "form_message_replies")
public class FormMessageReply {
    @Id String id;
    String messageId;
    String feedback = "";
    String timeStamp;
    String trainerId;

    public FormMessageReply(String messageId, String feedback, String timeStamp, String trainerId) {
        this.messageId = messageId;
        this.feedback = feedback;
        this.timeStamp = timeStamp;
        this.trainerId = trainerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }
}

package com.learnxiny.models;

/**
 * Created by spandhare on 3/5/16.
 */
public class Step {

    String stepNumber;
    String stepImageUrl;
    String stepTitle;
    String stepDescription;

    public Step(String stepNumber, String stepImageUrl, String stepTitle, String stepDescription) {
        this.stepNumber = stepNumber;
        this.stepImageUrl = stepImageUrl;
        this.stepTitle = stepTitle;
        this.stepDescription = stepDescription;
    }

    public String getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(String stepNumber) {
        this.stepNumber = stepNumber;
    }

    public String getStepImageUrl() {
        return stepImageUrl;
    }

    public void setStepImageUrl(String stepImageUrl) {
        this.stepImageUrl = stepImageUrl;
    }

    public String getStepTitle() {
        return stepTitle;
    }

    public void setStepTitle(String stepTitle) {
        this.stepTitle = stepTitle;
    }

    public String getStepDescription() {
        return stepDescription;
    }

    public void setStepDescription(String stepDescription) {
        this.stepDescription = stepDescription;
    }
}

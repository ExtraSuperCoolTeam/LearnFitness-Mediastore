package com.learnxiny.models;

/**
 * Created by spandhare on 3/6/16.
 */
public class TrainerParam {

    private String speciality;
    private String yrsOfTraining;
    private String height;
    private String weight;


    public TrainerParam(String speciality, String yrsOfTraining, String height, String weight) {
        this.speciality = speciality;
        this.yrsOfTraining = yrsOfTraining;
        this.height = height;
        this.weight = weight;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getYrsOfTraining() {
        return yrsOfTraining;
    }

    public void setYrsOfTraining(String yrsOfTraining) {
        this.yrsOfTraining = yrsOfTraining;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}

package com.learnxiny.models;

/**
 * Created by spandhare on 3/6/16.
 */
public class TrainerParam {

    private String Speciality;
    private String YrsOfTraining;
    private String Height;
    private String Weight;


    public TrainerParam(String speciality, String yrsOfTraining, String height, String weight) {
        Speciality = speciality;
        YrsOfTraining = yrsOfTraining;
        Height = height;
        Weight = weight;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public String getYrsOfTraining() {
        return YrsOfTraining;
    }

    public void setYrsOfTraining(String yrsOfTraining) {
        YrsOfTraining = yrsOfTraining;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String height) {
        Height = height;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }
}

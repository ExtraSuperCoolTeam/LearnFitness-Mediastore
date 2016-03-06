package com.learnxiny.models;

public class Trainer {

    String id;
    String name;
    String address;
    String phone;
    String profileUrl;
    TrainerParam trainerParams;
    TrainerLocation location;


    public Trainer(String id, String name, String address, String phone, String profileUrl,
                  TrainerParam trainerParams, TrainerLocation trainerLocation) {
        this.id = id;
        this.name = name;
        this.trainerParams = trainerParams;
        this.address = address;
        this.phone = phone;
        this.profileUrl = profileUrl;
        this.location = trainerLocation;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public TrainerParam getTrainerParams() {
        return trainerParams;
    }

    public void setTrainerParams(TrainerParam trainerParams) {
        this.trainerParams = trainerParams;
    }

    public TrainerLocation getLocation() {
        return location;
    }

    public void setLocation(TrainerLocation location) {
        this.location = location;
    }
}

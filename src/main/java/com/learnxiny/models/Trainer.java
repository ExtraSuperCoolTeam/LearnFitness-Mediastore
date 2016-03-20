package com.learnxiny.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "trainers")
public class Trainer {

    String id;
    String name;
    String address;
    String phone;
    String profileUrl;
    String handle;
    TrainerParam trainerParams;
    TrainerLocation location;

    public Trainer(String name, String address, String phone, String profileUrl, String handle,
                  TrainerParam trainerParams, TrainerLocation location) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.profileUrl = profileUrl;
        this.handle = handle;
        this.trainerParams = trainerParams;
        this.location = location;
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

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }
}

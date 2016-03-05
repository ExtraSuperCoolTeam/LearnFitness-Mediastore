package com.learnxiny.models;

import java.util.Map;

public class Trainer {

    String id;
    String name;
    String address;
    String phone;
    String profileUrl;
    Map<String, String> trainerParams;


    public Trainer(String id, String name, String address, String phone, String profileUrl,
                   Map<String, String> trainerParams) {
        this.id = id;
        this.name = name;
        this.trainerParams = trainerParams;
        this.address = address;
        this.phone = phone;
        this.profileUrl = profileUrl;

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

    public Map<String, String> getTrainerParams() {
        return trainerParams;
    }

    public void setTrainerParams(Map<String, String> trainerParams) {
        this.trainerParams = trainerParams;
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
}

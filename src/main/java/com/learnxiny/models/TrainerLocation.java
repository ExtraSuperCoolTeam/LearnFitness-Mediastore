package com.learnxiny.models;

/**
 * Created by spandhare on 3/6/16.
 */
public class TrainerLocation {
    String latitude;
    String longitude;

    public TrainerLocation(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}

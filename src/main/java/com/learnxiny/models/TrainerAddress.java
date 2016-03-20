package com.learnxiny.models;

/**
 * Created by spandhare on 3/20/16.
 */
public class TrainerAddress {
    String firstAddressLine;
    String secondAddressLine;

    public TrainerAddress(String firstAddressLine, String secondAddressLine) {
        this.firstAddressLine = firstAddressLine;
        this.secondAddressLine = secondAddressLine;
    }

    public String getFirstAddressLine() {
        return firstAddressLine;
    }

    public void setFirstAddressLine(String firstAddressLine) {
        this.firstAddressLine = firstAddressLine;
    }

    public String getSecondAddressLine() {
        return secondAddressLine;
    }

    public void setSecondAddressLine(String secondAddressLine) {
        this.secondAddressLine = secondAddressLine;
    }
}

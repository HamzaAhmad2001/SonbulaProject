package com.example.sonbulaapp;

import java.util.Date;

public class RequestsModel {

    private String disableName;
    private String disibilityName;
    private String needType;
    private Date date;
    private String location;
    private int image;
    private String timeAgo;

    public RequestsModel(String disableName, String disibilityName, String needType, String location,int image , String timeAgo) {
        this.disableName = disableName;
        this.disibilityName = disibilityName;
        this.needType = needType;
        this.location = location;
        this.image=image;
        this.timeAgo=timeAgo;
    }

    public String getDisableName() {
        return disableName;
    }

    public String getTimeAgo() {
        return timeAgo;
    }

    public String getDisibilityName() {
        return disibilityName;
    }

    public String getNeedType() {
        return needType;
    }

    public Date getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public int getImage() {
        return image;
    }
}

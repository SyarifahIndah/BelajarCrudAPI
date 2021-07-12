package com.syarifah.usercrudproject2.model;

import com.google.gson.annotations.SerializedName;

public class PostPutDelUser {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    User user;
    @SerializedName("message")
    String massage;

    public String getStatus(){
        return status;
    }

    public String getMassage(){
        return massage;
    }

    public User getUser() {
        return user;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

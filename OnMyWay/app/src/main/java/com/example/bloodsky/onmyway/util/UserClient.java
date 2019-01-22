package com.example.bloodsky.onmyway.util;

import android.app.Application;

import com.example.bloodsky.onmyway.models.User;

public class UserClient extends Application {

    private User user = null;

    public User getUser() {

        return user;
    }

    public void setUser(User user) {

        this.user = user;
    }

}

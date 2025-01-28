package com.example.instaclone;

public class User {
    private String username;
    private int profileImage;

    public User(String username, int profileImage) {
        this.username = username;
        this.profileImage = profileImage;
    }

    public String getUsername() {
        return username;
    }

    public int getProfileImage() {
        return profileImage;
    }
}
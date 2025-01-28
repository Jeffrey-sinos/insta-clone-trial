package com.example.instaclone;

public class Post {
    private String username;
    private int profileImage;
    private int postImage;

    public Post(String username, int profileImage, int postImage) {
        this.username = username;
        this.profileImage = profileImage;
        this.postImage = postImage;
    }

    public String getUsername() {
        return username;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public int getPostImage() {
        return postImage;
    }
}
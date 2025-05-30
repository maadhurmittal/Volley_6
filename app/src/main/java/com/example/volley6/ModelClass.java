package com.example.volley6;

public class ModelClass {
    String thumbnailUrl, title;

    public ModelClass(String thumbnailUrl, String title){
        this.title = title;
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public String getTitle() {
        return title;
    }
}

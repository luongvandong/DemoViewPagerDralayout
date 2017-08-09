package com.phongbm.viewpagerdemo;

public class Face {
    private int imageId;
    private String name;
    private int backgroundColor;

    public Face(int imageId, String name, int backgroundColor) {
        this.imageId = imageId;
        this.name = name;
        this.backgroundColor = backgroundColor;
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

}
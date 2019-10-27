package com.blogspot.sslaia.niasexplorer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Media {

    @SerializedName("url")
    @Expose
    private String imageUrl;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("width")
    @Expose
    private String width;

    public Media(String imageUrl, String height, String width) {
        super();
        this.imageUrl = imageUrl;
        this.height = height;
        this.width = width;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

}

package com.blogspot.sslaia.niasexplorer.model;

import com.google.gson.annotations.SerializedName;

public class AuthorAvatar {

    @SerializedName("width")
    private String width;
    @SerializedName("height")
    private String height;
    @SerializedName("src")
    private String src;

    public AuthorAvatar(String width, String height, String src) {
        super();
        this.width = width;
        this.height = height;
        this.src = src;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

}

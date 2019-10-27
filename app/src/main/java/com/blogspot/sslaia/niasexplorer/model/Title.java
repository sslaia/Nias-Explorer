package com.blogspot.sslaia.niasexplorer.model;

import com.google.gson.annotations.SerializedName;

public class Title {

    @SerializedName("$t")
    private String postTitle;

    public Title(String title) {
        super();
        this.postTitle = title;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setIPostTitle(String title) {
        this.postTitle = title;
    }
}

package com.blogspot.sslaia.niasexplorer.model;

import com.google.gson.annotations.SerializedName;

public class AuthorName {

    @SerializedName("$t")
    private String name;

    public AuthorName(String name) {
        super();
        this.name = name;
    }

    public String getAuthorName() {
        return name;
    }

    public void setAuthorName(String name) {
        this.name = name;
    }
}

package com.blogspot.sslaia.niasexplorer.model;

import com.google.gson.annotations.SerializedName;

public class AuthorEmail {

    @SerializedName("$t")
    private String email;

    public AuthorEmail(String email) {
        super();
        this.email = email;
    }

    public String getAuthorEmail() {
        return email;
    }

    public void setAuthorEmail(String email) {
        this.email = email;
    }
}

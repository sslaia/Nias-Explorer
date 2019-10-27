package com.blogspot.sslaia.niasexplorer.model;

import com.google.gson.annotations.SerializedName;

public class AuthorUri {
    @SerializedName("$t")
    private String authorUri;

    public AuthorUri(String authorUri) {
        super();
        this.authorUri = authorUri;
    }

    public String getAuthorUri() {
        return authorUri;
    }

    public void setAuthorUri(String authorUri) {
        this.authorUri = authorUri;
    }
}

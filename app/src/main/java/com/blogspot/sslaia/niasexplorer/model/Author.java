package com.blogspot.sslaia.niasexplorer.model;

import com.google.gson.annotations.SerializedName;

public class Author {

    @SerializedName("name")
    private AuthorName name;

    @SerializedName("uri")
    private AuthorUri uri;

    @SerializedName("email")
    private AuthorEmail email;

    @SerializedName("gd$image")
    private AuthorAvatar avatar;

    public Author(AuthorName name, AuthorUri uri, AuthorEmail email, AuthorAvatar avatar) {
        super();
        this.name = name;
        this.uri = uri;
        this.email = email;
        this.avatar = avatar;
    }

    public AuthorName getName() {
        return name;
    }

    public void setName(AuthorName name) {
        this.name = name;
    }

    public AuthorUri getUri() {
        return uri;
    }

    public void setUri(AuthorUri uri) {
        this.uri = uri;
    }

    public AuthorEmail getEmail() {
        return email;
    }

    public void setEmail(AuthorEmail email) {
        this.email = email;
    }

    public AuthorAvatar getAvatar() {
        return avatar;
    }

    public void setAuthorAvatar(AuthorAvatar avatar) {
        this.avatar = avatar;
    }
}

package com.blogspot.sslaia.niasexplorer.model;

import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("type")
    private String type;

    @SerializedName("$t")
    private String body;

    public Content(String type, String body) {
        super();
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

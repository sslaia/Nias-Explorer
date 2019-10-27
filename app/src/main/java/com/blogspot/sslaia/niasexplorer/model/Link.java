package com.blogspot.sslaia.niasexplorer.model;

import com.google.gson.annotations.SerializedName;

public class Link {

    @SerializedName("rel")
    private String rel;
    @SerializedName("type")
    private String type;
    @SerializedName("href")
    private String href;
    @SerializedName("title")
    private String title;

    public Link(String rel, String type, String href, String title) {
        super();
        this.rel = rel;
        this.type = type;
        this.href = href;
        this.title = title;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}

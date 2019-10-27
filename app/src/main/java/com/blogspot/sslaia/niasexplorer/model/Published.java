package com.blogspot.sslaia.niasexplorer.model;

import com.google.gson.annotations.SerializedName;

public class Published {
    @SerializedName("$t")
    private String pubDate;

    public Published(String pubDate) {
        super();
        this.pubDate = pubDate;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }
}

package com.blogspot.sslaia.niasexplorer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {
    @SerializedName("feed")
    @Expose
    private Feed feed;

    public Item(Feed feed) {
        super();
        this.feed = feed;
    }

    public Feed getFeed() {
        return feed;
    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }
}

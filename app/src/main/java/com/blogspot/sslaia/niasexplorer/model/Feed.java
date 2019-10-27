package com.blogspot.sslaia.niasexplorer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Feed {
    @SerializedName("entry")
    @Expose
    private ArrayList<Entry> entry;

    public Feed(ArrayList<Entry> entry) {
        super();
        this.entry = entry;
    }

    public ArrayList<Entry> getEntry() {
        return entry;
    }

    public void setEntry(ArrayList<Entry> entry) {
        this.entry = entry;
    }
}

package com.blogspot.sslaia.niasexplorer.model;

import com.google.gson.annotations.SerializedName;

public class Category {

    @SerializedName("term")
    private String categoryName;

    public Category(String categoryName) {
        super();
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}

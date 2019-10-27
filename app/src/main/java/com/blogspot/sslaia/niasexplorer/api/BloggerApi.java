package com.blogspot.sslaia.niasexplorer.api;

import com.blogspot.sslaia.niasexplorer.model.Item;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BloggerApi {
    @GET("feeds/posts/default?alt=json")
    Call<Item> getPosts();
}

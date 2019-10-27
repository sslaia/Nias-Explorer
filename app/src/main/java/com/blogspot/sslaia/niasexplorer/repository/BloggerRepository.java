package com.blogspot.sslaia.niasexplorer.repository;

import androidx.lifecycle.MutableLiveData;

import com.blogspot.sslaia.niasexplorer.api.BloggerApi;
import com.blogspot.sslaia.niasexplorer.api.BloggerApiFactory;
import com.blogspot.sslaia.niasexplorer.model.Entry;
import com.blogspot.sslaia.niasexplorer.model.Feed;
import com.blogspot.sslaia.niasexplorer.model.Item;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BloggerRepository {
    private static BloggerRepository repository;
    private static BloggerApi api;

    public BloggerRepository() {
        api = BloggerApiFactory.create();
    }

    public static BloggerRepository getInstance() {
        if (repository == null) {
            repository = new BloggerRepository();
        }
        return repository;
    }

    public MutableLiveData<Feed> getPosts() {
        final MutableLiveData<Feed> feed = new MutableLiveData<>();

        api.getPosts()
           .enqueue(new Callback<Item>() {
            @Override
            public void onResponse(Call<Item> call, Response<Item> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        feed.setValue(response.body().getFeed());
                    }
                }
            }

            @Override
            public void onFailure(Call<Item> call, Throwable t) {
                feed.setValue(null);
            }
        });
        return feed;
    }
}

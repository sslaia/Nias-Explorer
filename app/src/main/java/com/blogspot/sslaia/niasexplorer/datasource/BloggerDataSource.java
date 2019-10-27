package com.blogspot.sslaia.niasexplorer.datasource;

import androidx.annotation.NonNull;
import androidx.paging.PageKeyedDataSource;

import com.blogspot.sslaia.niasexplorer.api.BloggerApi;
import com.blogspot.sslaia.niasexplorer.model.Entry;
import com.blogspot.sslaia.niasexplorer.model.Item;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BloggerDataSource extends PageKeyedDataSource<Long, Entry> {

    private BloggerApi bloggerApi;

    public BloggerDataSource() {
    }

    @Override
    public void loadInitial(@NonNull LoadInitialParams<Long> params,
                            @NonNull final LoadInitialCallback<Long, Entry> callback) {

        bloggerApi.getPosts().enqueue(new Callback<Item>() {
            @Override
            public void onResponse(Call<Item> call, Response<Item> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        callback.onResult(response.body().getFeed().getEntry(), null, 2l);
                    }
                }
            }

            @Override
            public void onFailure(Call<Item> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    @Override
    public void loadBefore(@NonNull LoadParams<Long> params,
                           @NonNull LoadCallback<Long, Entry> callback) {

    }

    @Override
    public void loadAfter(@NonNull final LoadParams<Long> params,
                          @NonNull final LoadCallback<Long, Entry> callback) {

        bloggerApi.getPosts().enqueue(new Callback<Item>() {
            @Override
            public void onResponse(Call<Item> call, Response<Item> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        callback.onResult(response.body().getFeed().getEntry(), params.key + 1l);
                    }
                }
            }

            @Override
            public void onFailure(Call<Item> call, Throwable t) {

            }
        });

    }
}

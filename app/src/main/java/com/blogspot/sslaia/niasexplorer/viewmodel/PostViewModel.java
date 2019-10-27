package com.blogspot.sslaia.niasexplorer.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.blogspot.sslaia.niasexplorer.model.Entry;
import com.blogspot.sslaia.niasexplorer.model.Feed;
import com.blogspot.sslaia.niasexplorer.model.Item;
import com.blogspot.sslaia.niasexplorer.repository.BloggerRepository;

import java.util.ArrayList;

public class PostViewModel extends ViewModel {

    private MutableLiveData<Feed> feed;
    private BloggerRepository repository;

    public PostViewModel() {
        init ();
    }

    public void init() {
        if (feed != null) {
            return;
        }
        repository = BloggerRepository.getInstance();
        feed = repository.getPosts();
    }

    public LiveData<Feed> getBloggerRepository() {
        return feed;
    }

}

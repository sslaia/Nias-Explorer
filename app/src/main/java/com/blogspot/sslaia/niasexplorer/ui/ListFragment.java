package com.blogspot.sslaia.niasexplorer.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blogspot.sslaia.niasexplorer.R;
import com.blogspot.sslaia.niasexplorer.adapter.PostAdapter;
import com.blogspot.sslaia.niasexplorer.model.Entry;
import com.blogspot.sslaia.niasexplorer.model.Feed;
import com.blogspot.sslaia.niasexplorer.model.Item;
import com.blogspot.sslaia.niasexplorer.viewmodel.PostViewModel;

import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment {

    private View view;
    private RecyclerView rv;
    private PostAdapter adapter;
    private ArrayList<Entry> posts;

    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_rv, container, false);
        }
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        rv = view.findViewById(R.id.recycler_view);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setHasFixedSize(true);

        PostViewModel model = ViewModelProviders.of(this).get(PostViewModel.class);
        model.init();
        model.getBloggerRepository().observe(getViewLifecycleOwner(), new Observer<Feed>() {
            @Override
            public void onChanged(Feed feed) {
                posts = feed.getEntry();
                adapter = new PostAdapter(getContext(), posts);
                rv.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }
        });

//        setupRecyclerView();
    }

//    private void setupRecyclerView() {
//        if (adapter == null) {
//            adapter = new PostAdapter(getContext(), posts);
//
//            rv = view.findViewById(R.id.recycler_view);
//            rv.setLayoutManager(new LinearLayoutManager(getActivity()));
//            rv.setHasFixedSize(true);
//            rv.setAdapter(adapter);
//        } else {
//            adapter.notifyDataSetChanged();
//        }
//    }
}

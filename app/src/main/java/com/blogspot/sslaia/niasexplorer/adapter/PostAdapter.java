package com.blogspot.sslaia.niasexplorer.adapter;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.recyclerview.widget.RecyclerView;

import com.blogspot.sslaia.niasexplorer.R;
import com.blogspot.sslaia.niasexplorer.model.Entry;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private ArrayList<Entry> posts;
    private Context context;

    public PostAdapter(Context context, ArrayList<Entry> entries) {
        this.context = context;
        this.posts = entries;
    }

    @NonNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.fragment_rv_list, parent, false);
        return new PostAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final PostAdapter.ViewHolder holder, final int position) {

        String pubDate = posts.get(position).getPublished().getPubDate().substring(0,10);
        String authorName = posts.get(position).getAuthor().get(0).getName().getAuthorName();
        String info = pubDate + " | " + authorName;

        holder.info.setText(info);
        holder.title.setText(posts.get(position).getTitle().getPostTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: open the article body in a fragment here
                String postUrl = posts.get(position).getLink().get(2).getHref();

                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                int color = Color.parseColor("#01579b");
                builder.setToolbarColor(color);
                CustomTabsIntent i = builder.build();
                i.launchUrl(holder.itemView.getContext(), Uri.parse(postUrl));
            }
        });
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView info,title;

        public ViewHolder(View view) {
            super(view);
            info = view.findViewById(R.id.info_view);
            title = view.findViewById(R.id.title_view);
        }
    }
}

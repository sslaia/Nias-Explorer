package com.blogspot.sslaia.niasexplorer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Entry {
    @SerializedName("id")
    @Expose
    private NewsId newsId;

    @SerializedName("published")
    @Expose
    private Published published;

    @SerializedName("category")
    @Expose
    private List<Category> category;

    @SerializedName("title")
    @Expose
    private Title title;

    @SerializedName("content")
    @Expose
    private Content content;

    @SerializedName("link")
    @Expose
    private List<Link> link;

    @SerializedName("author")
    @Expose
    private List<Author> author;

    @SerializedName("media$thumbnail")
    @Expose
    private Media thumbnail;

    public Entry(NewsId newsId, Published published, List<Category> category, Title title, Content content, List<Link> link, List<Author> author, Media thumbnail) {
        super();
        this.newsId = newsId;
        this.published = published;
        this.category = category;
        this.title = title;
        this.content = content;
        this.link = link;
        this.author = author;
        this.thumbnail = thumbnail;
    }

    public NewsId getNewsId() {
        return newsId;
    }

    public void setNewsId(NewsId newsId) {
        this.newsId = newsId;
    }

    public Published getPublished() {
        return published;
    }

    public void setPublished(Published published) {
        this.published = published;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public List<Link> getLink() {
        return link;
    }

    public void setLink(List<Link> link) {
        this.link = link;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public Media getMedia() {
        return thumbnail;
    }

    public void setMedia(Media thumbnail) {
        this.thumbnail = thumbnail;
    }
}

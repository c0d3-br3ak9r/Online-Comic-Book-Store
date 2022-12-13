package com.example.demo;

public class BookModel {
    private int id;
    private String title;
    private String desc;
    private int rating;
    private int downloads;
    private int reads;
    private String url;

    BookModel(int id, String title, String desc, int rating, int downloads, int reads, String url) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.rating = rating;
        this.downloads = downloads;
        this.reads = reads;
        this.url = url;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String newDesc) {
        this.desc = newDesc;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int newRating) {
        this.rating = newRating;
    }

    public int getReads() {
        return this.reads;
    }

    public void setReads(int newReads) {
        this.reads = newReads;
    }

    public int getDownloads() {
        return this.downloads;
    }

    public void setDownloads(int newDownloads) {
        this.downloads = newDownloads;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String newUrl) {
        this.url = newUrl;
    }
}

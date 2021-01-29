package com.example.android.mio;

public class News {

    private String sectionName;
    private String title;
    private String date;
    private String url;

    public News(String sectionName, String title, String date, String url) {
        this.sectionName = sectionName;
        this.title = title;
        this.date = date;
        this.url = url;
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }
}

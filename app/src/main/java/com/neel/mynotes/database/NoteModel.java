package com.neel.mynotes.database;

class NoteModel {
    private long id;
    private String title;
    private String content;
    private String date;
    private String time;
    private String image;

    public NoteModel(long id, String title, String content, String date, String time, String image) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
        this.time = time;
        this.image = image;
    }

    public NoteModel(String title, String content, String date, String time, String image) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.time = time;
        this.image = image;
    }

    public NoteModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

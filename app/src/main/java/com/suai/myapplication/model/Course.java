package com.suai.myapplication.model;

public class Course {
    int id;
    String img, title, color, text;

    public Course(int id, String img, String title, String color, String text) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.color = color;
        this.text = text;
    }



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

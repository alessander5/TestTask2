package com.infy.domain;

/**
 * Created by Infy on 29.05.2016.
 */
public class Response {
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    String text;
    int count;
}

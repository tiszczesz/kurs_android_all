package com.example.my9application;

public class ExampleItem {
    private int imageView;
    private String textView1;
    private String textView2;

    public ExampleItem(int mImageView, String mTextView1, String mTextView2) {
        this.imageView = mImageView;
        this.textView1 = mTextView1;
        this.textView2 = mTextView2;
    }

    public int getImageView() {
        return imageView;
    }

    public String getTextView1() {
        return textView1;
    }

    public String getTextView2() {
        return textView2;
    }
}

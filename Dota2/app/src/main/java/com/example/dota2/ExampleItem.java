package com.example.dota2;

public class ExampleItem {
    private String mImageUrl;
    private String mName;
    private String mDetail;
    private int mRating;

    public ExampleItem(String imageUrl, String name, int rating, String detail) {
        mImageUrl = imageUrl;
        mName = name;
        mRating = rating;
        mDetail = detail;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getName() {
        return mName;
    }

    public String getDetail() {
        return mDetail;
    }

    public int getRating() {
        return mRating;
    }
}
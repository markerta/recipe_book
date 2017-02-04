package com.example.android.navigationdrawer;

/**
 * Custom class to hold all Recipe attributes
 */

public class Recipe {

    private String mRecipeName;

    private int mImageResourceId;

    public Recipe(String recipeName, int imageResourceId) {
        mRecipeName=recipeName;
        mImageResourceId=imageResourceId;
    }

    public String getRecipeName() { return mRecipeName; }

    public int getImageResourceId() { return mImageResourceId; }

}

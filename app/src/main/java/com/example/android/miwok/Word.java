package com.example.android.miwok;

import android.media.Image;

/**
 * Created by ahmed on 3/3/2018.
 */

public class Word {


    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private boolean hasImage = false;
    private int mImageResourceID;
    private int mAudioResourceID;


    public Word(String DefaultTranslation, String MiwokTranslation, int WordImage,int AudioResourceID){

        this.mDefaultTranslation = DefaultTranslation;
        this.mMiwokTranslation = MiwokTranslation;
        this.mAudioResourceID = AudioResourceID;
        this.mImageResourceID = WordImage;
        hasImage = !hasImage;
    }
    public Word(String DefaultTranslation, String MiwokTranslation,int AudioResourceID){

        this.mDefaultTranslation = DefaultTranslation;
        this.mMiwokTranslation = MiwokTranslation;
        this.mAudioResourceID = AudioResourceID;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }
    public int getAudioResourceID(){return mAudioResourceID;}
    public boolean hasImage(){
        return hasImage;
    }
}

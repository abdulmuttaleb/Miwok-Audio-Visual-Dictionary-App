package com.example.android.miwok;

/**
 * Created by ahmed on 3/3/2018.
 */

public class Word {


    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public Word(String DefaultTranslation, String MiwokTranslation){

        this.mDefaultTranslation = DefaultTranslation;
        this.mMiwokTranslation = MiwokTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
}

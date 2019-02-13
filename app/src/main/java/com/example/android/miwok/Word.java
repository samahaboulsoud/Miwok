package com.example.android.miwok;

/**
 * Created by samah on 3/10/2018.
 */

import android.media.Image;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Image specified for the word
     */
    private int mImageResourceId;

    /**
     * Audio specified for the word
     */
    private int mSoundResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     *
     * @param soundResourceId is the raw resource id for the sound displayed with the Miwok word
     */
    public Word(String defaultTranslation, String miwokTranslation,int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceId = soundResourceId;
    }

    /**
     * * Create a new Word construction .
     * @param imageResourceId is the drawable resource id for the image associated with the Miwok word
     */

    public Word(String defaultTranslation, String miwokTranslation,int soundResourceId, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceId = soundResourceId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the the image resource id of the image.
     */
    public int getImageResourceId() { return mImageResourceId; }

    /**
     * Get the the image resource id of the image.
     */
    public int getSoundResourceId() { return mSoundResourceId; }

}

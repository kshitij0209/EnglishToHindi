package com.example.android.miwok;

/**
 * Created by Kshitij on 12/23/2016.
 */
public class Word {
    private String defaultWord;
    private String anotherLang;
    private int imageResourceId=IMAGE_RESOURCE_ID;
   private int audioResourceId;
    private static final int IMAGE_RESOURCE_ID = 1;
    public Word(String defaultWord, String anotherLang){
        this.defaultWord=defaultWord;
        this.anotherLang=anotherLang;
    }
    public Word(String defaultWord ,String anotherLang, int audioResourceId){
        this(defaultWord,anotherLang);
        this.audioResourceId=audioResourceId;
    }
    public Word(String defaultWord, String anotherLang,int imageResourceId,int audioResourceId){
        this(defaultWord, anotherLang);
        this.imageResourceId=imageResourceId;
        this.audioResourceId=audioResourceId;
    }
    public String getDefaultWord(){
        return defaultWord;
    }
    public String getAnotherLang(){
        return anotherLang;
    }
    public int getImmageResourceId(){return imageResourceId;}
    public int getAudioResourceId(){
        return audioResourceId;
   }
    public boolean hasImage(){
        if(imageResourceId!=IMAGE_RESOURCE_ID){
            return true;
        }
        return false;
    }
}


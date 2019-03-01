package com.example.android.miwok;

public class Word {

    private String mMiwokTranslation;
    private String mEnglishTranslation;
    private int reourceId =-1;
    private int resourceIdOfAudio;

    public Word(String mEnglishTranslation,String mMiwokTranslation,int resourceIdOfAudio){
        this.mEnglishTranslation = mEnglishTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.resourceIdOfAudio = resourceIdOfAudio;
    }

    public Word(String mEnglishTranslation,int resourceId,String mMiwokTranslation,int resourceIdOfAudio){
        this.resourceIdOfAudio = resourceIdOfAudio;
        this.mEnglishTranslation = mEnglishTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.reourceId = resourceId;
    }

 public boolean IsImage(){
        return reourceId!=-1;
 }

 public int getReourceId(){
        return reourceId;
 }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getEnglishTranslation(){
       return mEnglishTranslation;
    }
    public int getResourceIdOfAudio(){
        return resourceIdOfAudio;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mEnglishTranslation='" + mEnglishTranslation + '\'' +
                ", reourceId=" + reourceId +
                ", resourceIdOfAudio=" + resourceIdOfAudio +
                '}';
    }
}

package com.example.myapplication.str;

public class MStudent {

    public String mPictureURL;
    public String mName;
    public String mSchool;
    public String mBirthYear;

    public void mSetData(MStudent _str) {
        mSetData(_str.mPictureURL,
                _str.mName,
                _str.mSchool,
                _str.mBirthYear);
    }

    public void mSetData(String mPictureURL, String mName, String mSchool, String mBirthYear) {
        this.mPictureURL = mPictureURL;
        this.mName = mName;
        this.mSchool = mSchool;
        this.mBirthYear = mBirthYear;
    }
}

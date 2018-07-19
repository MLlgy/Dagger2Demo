package com.example.administrator.dagger2demo.aboutcomponent;

/**
 * Author：liguoying
 * Data: 18-7-19 22:37
 */
public class People {
    private String mSchool;
    private int phoneNum;

    public People(String mSchool, int phoneNum) {
        this.mSchool = mSchool;
        this.phoneNum = phoneNum;
    }

    public String getmSchool() {
        return mSchool;
    }

    public void setmSchool(String mSchool) {
        this.mSchool = mSchool;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
}

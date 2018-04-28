package com.example.administrator.dagger2demo.practicetwo;

import javax.inject.Inject;

public class UserTwo {

    private String mSex = "man";
    private int mCarNum = 7;

    //    @Inject
    public UserTwo() {
    }

    //    @Inject
    public UserTwo(String mSex, int mCarNum) {
        this.mSex = mSex;
        this.mCarNum = mCarNum;
    }

    public String getSex() {
        return mSex;
    }

    public void setSex(String mSex) {
        this.mSex = mSex;
    }

    public int getCarNum() {
        return mCarNum;
    }

    public void setCarNum(int mCarNum) {
        this.mCarNum = mCarNum;
    }
}

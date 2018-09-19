package com.example.administrator.dagger2demo.practiceThree;

import javax.inject.Named;

public class UserThird {

    private String mSex = "man";
    private int mCarNum = 7;

//    @UserThirdQualifier("a")
//    @Inject
//    @Named("a")
    public UserThird() {
    }
//    @UserThirdQualifier("b")
//    @Inject
//    @Named("b")
    public UserThird(String mSex, int mCarNum) {
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

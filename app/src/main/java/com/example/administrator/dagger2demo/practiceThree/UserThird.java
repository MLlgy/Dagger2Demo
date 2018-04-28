package com.example.administrator.dagger2demo.practiceThree;

public class UserThird {

    private String mSex = "man";
    private int mCarNum = 7;

    @UserThirdQualifier("a")
//    @Inject
    public UserThird() {
    }
    @UserThirdQualifier("b")
//    @Inject
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

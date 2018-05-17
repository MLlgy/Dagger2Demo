package com.example.administrator.dagger2demo.mvpDagger.models;

/**
 * Creater: liguoying
 * Time: 2018/5/17 0017 16:45
 */
public class User {

    private String uId;

    private  String uName;

    private String uPwd;

    private String uType;

    private String uLevel;

    public String getuId() {
        return uId;
    }

    public void setuId(String mUId) {
        uId = mUId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String mUName) {
        uName = mUName;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String mUPwd) {
        uPwd = mUPwd;
    }

    public String getuType() {
        return uType;
    }

    public void setuType(String mUType) {
        uType = mUType;
    }

    public String getuLevel() {
        return uLevel;
    }

    public void setuLevel(String mULevel) {
        uLevel = mULevel;
    }
}

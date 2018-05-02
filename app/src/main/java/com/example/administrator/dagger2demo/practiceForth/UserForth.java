package com.example.administrator.dagger2demo.practiceForth;

/**
 * Creater: liguoying
 * Time: 2018/4/28 0028 16:59
 */
public class UserForth {
    private String mName = "john";
    private String mAge = "eleven";

    public UserForth() {
    }

    public UserForth(String mName, String mAge) {
        this.mName = mName;
        this.mAge = mAge;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getAge() {
        return mAge;
    }

    public void setAge(String mAge) {
        this.mAge = mAge;
    }
}

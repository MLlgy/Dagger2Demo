package com.example.administrator.dagger2demo.practiceFifth;

import android.util.Log;

import javax.inject.Inject;

/**
 * Author：Administrator
 * Data: 2018/9/19 0019 16:39
 */
@TestScope
public class AppleBean {

    private String color;
    private int weight;

    @Inject
    public AppleBean() {
        Log.e("TAG", "AppleBean");
    }
}

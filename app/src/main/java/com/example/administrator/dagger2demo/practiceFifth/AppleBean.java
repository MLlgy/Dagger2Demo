package com.example.administrator.dagger2demo.practiceFifth;

import android.util.Log;

/**
 * Author：Administrator
 * Data: 2018/9/19 0019 16:39
 */
@AnyOneScope
public class AppleBean {

    private String color;
    private int weight;

    public AppleBean() {
        Log.e("TAG", "AppleBean");
    }
}

package com.example.administrator.dagger2demo.practicetwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.administrator.dagger2demo.R;

import javax.inject.Inject;
import javax.inject.Qualifier;

public class SecondActivity extends AppCompatActivity {

    @Inject
    UserTwo mUserTwo;

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        DaggerUserTwoComponent.builder().userTwoModule(new UserTwoModule()).build().injectToSecondActivity(this);
        Log.e(TAG, "onCreate: " + "sex" + mUserTwo.getSex() + " number：" + mUserTwo.getCarNum());
        mUserTwo.setCarNum(46);
        mUserTwo.setSex("女");
        Log.e(TAG, "onCreate: " + "sex" + mUserTwo.getSex() + " number：" + mUserTwo.getCarNum());

        /**
         * onCreate: sex男 number：1243
         * onCreate: sex女 number：46
         */
    }
}

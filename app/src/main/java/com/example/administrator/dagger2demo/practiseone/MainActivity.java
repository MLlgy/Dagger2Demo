package com.example.administrator.dagger2demo.practiseone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.administrator.dagger2demo.R;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * User 所在的类  -- 目标类
 */

public class MainActivity extends AppCompatActivity {

    @Inject
    User mUser;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerUserComponent.builder().build().inject(this);
        Log.e(TAG,"name : " + mUser.getName() + " age :" + mUser.getAge());
        mUser.setAge(50);
        mUser.setName("blur");
        Log.e(TAG,"name2 : " + mUser.getName() + " age2 :" + mUser.getAge());


        /**
         * 打印日志：
         * name : jack chen age :40
         * name2 : blur age2 :50
         */
    }
}

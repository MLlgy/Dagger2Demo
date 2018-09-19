package com.example.administrator.dagger2demo.practiceThree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.administrator.dagger2demo.R;

import javax.inject.Inject;
import javax.inject.Named;

public class ThirdActivity extends AppCompatActivity {
//    @UserThirdQualifier("c")
    @Named("a")
    @Inject
    UserThird mUserTwoC;

//    @UserThirdQualifier("d")
    @Named("b")
    @Inject
    UserThird mUserTwoD;

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        DaggerUserThirdComponent.builder().userThirdModule(new UserThirdModule()).build().injectToThirdActivity(this);
        Log.e(TAG, "onCreate: " + "sex" + mUserTwoC.getSex() + " number：" + mUserTwoC.getCarNum());
        mUserTwoC.setCarNum(46);
        mUserTwoC.setSex("女");
        Log.e(TAG, "onCreate: " + "sex" + mUserTwoC.getSex() + " number：" + mUserTwoC.getCarNum());

        Log.e(TAG, "onCreate: " + "sex" + mUserTwoD.getSex() + " number：" + mUserTwoD.getCarNum());

        /**
         * onCreate: sex男 number：1243
         * onCreate: sex女 number：46
         */
    }
}

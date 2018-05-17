package com.example.administrator.dagger2demo.practiceForth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.administrator.dagger2demo.R;

import javax.inject.Inject;

public class ForthActivity extends AppCompatActivity {
    private static final String TAG = "ForthActivity";

    @UserForthAnnotation("a")
    @Inject
    UserForth mUserForthOne;

    @UserForthAnnotation("b")
    @Inject
    UserForth mUserForthTwo;

    private UserForthComponent mForthComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);
//        mForthComponent = DaggerUserForthComponent.builder().build();

        mForthComponent = DaggerUserForthComponent.builder().userForthModule(new UserForthModule()).build();
        mForthComponent.injectIntoForthActivity(this);
        Log.e(TAG, "onCreate() returned: " + mUserForthOne.getName() + " 1 " + mUserForthOne.getAge());
        Log.e(TAG, "onCreate() returned: " + mUserForthTwo.getName() + " 2 " + mUserForthTwo.getAge());






    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mForthComponent = null;
    }
}

package com.example.administrator.dagger2demo.practiceFifth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.administrator.dagger2demo.R;

public class FlowerScopeActivity extends AppCompatActivity {


    FruitComponent mFruitComponent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_scope);

//        DaggerFlowerComponent.builder().build().inject(this);

//        mFruitComponent = FuriteScopeActivity.getFruitComponent();
//        Log.e("TAG", "FlowerScopeActivity FruitComponent: " + mFruitComponent.toString());
    }
}

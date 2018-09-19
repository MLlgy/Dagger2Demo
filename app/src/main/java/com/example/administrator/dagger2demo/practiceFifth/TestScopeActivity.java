package com.example.administrator.dagger2demo.practiceFifth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.administrator.dagger2demo.R;

import javax.inject.Inject;

public class TestScopeActivity extends AppCompatActivity {

    @Inject
    AppleBean mAppleBeanA;
    @Inject
    AppleBean mAppleBeanB;
    @Inject
    OrgranBean mOrgranBeanA;
    @Inject
    OrgranBean mOrgranBeanB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_scope);

        FruitComponent mFruitComponent = DaggerFruitComponent.builder().fruitModule(new FruitModule()).build();
        mFruitComponent.inject(this);// 完成注入，没有这句话是不行的

        Log.e("TAG", "mAppleBeanA:" + mAppleBeanA.toString());
        Log.e("TAG", "mAppleBeanB:" + mAppleBeanB.toString());

        Log.e("TAG", "mOrgranBeanA:" + mOrgranBeanA.toString());
        Log.e("TAG", "mOrgranBeanB:" + mOrgranBeanB.toString());


    }
}

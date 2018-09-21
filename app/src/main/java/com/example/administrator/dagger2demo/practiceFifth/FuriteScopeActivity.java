package com.example.administrator.dagger2demo.practiceFifth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.administrator.dagger2demo.R;

import javax.inject.Inject;

public class FuriteScopeActivity extends AppCompatActivity {

    @Inject
    AppleBean mAppleBeanA;
    @Inject
    AppleBean mAppleBeanB;


    @Inject
    OrgranBean mOrgranBeanA;
    @Inject
    OrgranBean mOrgranBeanB;

    /*public static*/ FruitComponent mFruitComponent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_scope);

        mFruitComponent = DaggerFruitComponent.builder().fruitModule(new FruitModule()).build();
        mFruitComponent.inject(this);// 完成注入，没有这句话是不行的

        Log.e("TAG", "mAppleBeanA:" + mAppleBeanA.toString());
        Log.e("TAG", "mAppleBeanB:" + mAppleBeanB.toString());

        Log.e("TAG", "mOrgranBeanA:" + mOrgranBeanA.toString());
        Log.e("TAG", "mOrgranBeanB:" + mOrgranBeanB.toString());


    }

    public void jump(View view) {

        Intent mIntent = new Intent(this, FlowerScopeActivity.class);
        Bundle mBundle = new Bundle();
//        mBundle.putSerializable("op",mFruitComponent);

        startActivity(mIntent);
    }

//    public static FruitComponent getFruitComponent() {
//        return mFruitComponent;
//    }

}

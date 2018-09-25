package com.example.administrator.dagger2demo.practiceSixth.componentDependy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.dagger2demo.R;

import javax.inject.Inject;

public class ComponentDepActivity extends AppCompatActivity {

    @Inject
    SubBean mSubBean;
    @Inject
    AllBean mAllBean;

    AllComponent mAllComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component_dep);
        mAllComponent =  DaggerAllComponent.builder().allModule(new AllModule()).build();
        DaggerSubComponent.builder().allComponent(mAllComponent).build().injectSubComponentActivity(this);
        mSubBean.test();
        mAllBean.test();
    }
}

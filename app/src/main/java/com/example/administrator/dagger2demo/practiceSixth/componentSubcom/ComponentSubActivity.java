package com.example.administrator.dagger2demo.practiceSixth.componentSubcom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.dagger2demo.R;

import javax.inject.Inject;

public class ComponentSubActivity extends AppCompatActivity {

    @Inject
    AllBean mAllBean;

    @Inject
    SubBean mSubBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component_sub);
        AllComponent mAllComponent = DaggerAllComponent.builder().build();

        mAllComponent.addSub(new SubModule()).injectSubComponentActivity(this);

        mAllBean.test();
        mSubBean.test();

    }
}

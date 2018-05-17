package com.example.administrator.dagger2demo.mvpDagger;

import android.app.Application;

import com.example.administrator.dagger2demo.mvpDagger.Di.AppComponent;
import com.example.administrator.dagger2demo.mvpDagger.Di.AppModule;
import com.example.administrator.dagger2demo.mvpDagger.Di.DaggerAppComponent;

/**
 * Creater: liguoying
 * Time: 2018/5/17 0017 18:08
 */
public class ThisPartApplication extends Application {
    private AppComponent mAppComponent;
    private static ThisPartApplication mThisPartApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mThisPartApplication = this;
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public static ThisPartApplication  getInstance(){
        return mThisPartApplication;
    }

    public AppComponent getAppComponent(){
        return  mAppComponent;
    }
}

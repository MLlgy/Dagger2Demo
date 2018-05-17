package com.example.administrator.dagger2demo.mvpDagger.Di;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Creater: liguoying
 * Time: 2018/5/17 0017 18:01
 */
@Module
public class AppModule {
    private Context mContext;

    public AppModule(Context mContext) {
        this.mContext = mContext;
    }
    @Provides
    public Context provideContext(){
        return this.mContext;
    }
}

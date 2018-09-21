package com.example.administrator.dagger2demo.practiceFifth;

import dagger.Module;
import dagger.Provides;

/**
 * Author：Administrator
 * Data: 2018/9/19 0019 17:12
 */

@Module
public class FlowersModule {

    @Provides
    RoseBean provideRose(){
        return new RoseBean();
    }

    @Provides
    LoutsBean provideLouts(){
        return new LoutsBean();
    }
}

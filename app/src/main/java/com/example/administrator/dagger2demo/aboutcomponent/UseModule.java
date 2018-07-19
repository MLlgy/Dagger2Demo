package com.example.administrator.dagger2demo.aboutcomponent;

import dagger.Module;
import dagger.Provides;

/**
 * Author：liguoying
 * Data: 18-7-19 22:37
 */
@Module
public class UseModule {

    private People mPeople;

    public UseModule(People mPeople) {
        this.mPeople = mPeople;
    }

    @Provides
    People providePeople(){
        return mPeople;
    }
}

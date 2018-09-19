package com.example.administrator.dagger2demo.practiceFifth;

import dagger.Module;
import dagger.Provides;

/**
 * Author：Administrator
 * Data: 2018/9/19 0019 16:43
 */

@Module
public class FruitModule {

    @TestScope
    @Provides
    AppleBean provideApple() {
        return new AppleBean();
    }

    @TestScope
    @Provides
    OrgranBean provideOrgran() {
        return new OrgranBean();
    }
}

package com.example.administrator.dagger2demo.practiceSixth.componentDependy;

import dagger.Module;
import dagger.Provides;

/**
 * Author：Administrator
 * Data: 2018/9/25 0025 11:01
 */
@Module
public class AllModule {

    @Provides
    public AllBean provideAllBean() {
        return new AllBean();
    }
}

package com.example.administrator.dagger2demo.practiceSixth.componentSubcom;

import dagger.Module;
import dagger.Provides;

/**
 * Author：Administrator
 * Data: 2018/9/25 0025 11:01
 */

@Module
public class SubModule {

    @Provides
    public SubBean provideAllBean() {
        return new SubBean();
    }
}

package com.example.administrator.dagger2demo.aboutcomponent;

import dagger.Module;
import dagger.Provides;

/**
 * Author：liguoying
 * Data: 18-7-19 22:26
 */
@Module
public class ModuleSubComponentB {

    @Provides
    UserB provideUserA() {
        return new UserB("li na B", 12);
    }
}

package com.example.administrator.dagger2demo.aboutcomponent;


import dagger.Module;
import dagger.Provides;

@Module
public class ModuleSubComponentA {
    @Provides
    UserA provideUserA() {
        return new UserA("li hua A", 12);
    }
}

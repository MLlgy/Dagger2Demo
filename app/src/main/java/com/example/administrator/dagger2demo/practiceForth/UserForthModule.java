package com.example.administrator.dagger2demo.practiceForth;

import dagger.Module;
import dagger.Provides;

/**
 * Creater: liguoying
 * Time: 2018/4/28 0028 17:00
 */
@Module
public class UserForthModule {

    @UserForthScope
    @UserForthAnnotation("a")
    @Provides
    UserForth provideUserForthWithoutParams(){
        return new UserForth();
    };

    @UserForthScope
    @UserForthAnnotation("b")
    @Provides
    UserForth provideUser(){
        return new UserForth("kobe","36");
    }

}

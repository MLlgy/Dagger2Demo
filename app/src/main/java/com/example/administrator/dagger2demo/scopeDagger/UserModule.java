package com.example.administrator.dagger2demo.scopeDagger;

import com.example.administrator.dagger2demo.practiceForth.UserForthScope;

import dagger.Module;
import dagger.Provides;

/**
 * Creater: liguoying
 * Time: 2018/7/17 0017 12:59
 */
@Module
public class UserModule {
    private User mUser;

    public UserModule(User mUser) {
        this.mUser = mUser;
    }

    @Provides
    @UserForthScope
    User provideUser(){
        return mUser;
    }
}

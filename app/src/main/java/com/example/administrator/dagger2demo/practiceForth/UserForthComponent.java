package com.example.administrator.dagger2demo.practiceForth;

import dagger.Component;

/**
 * Creater: liguoying
 * Time: 2018/4/28 0028 17:03
 */
@UserForthScope
@Component(modules = UserForthModule.class)
public interface UserForthComponent {
    public void injectIntoForthActivity(ForthActivity mForthActivity);
}

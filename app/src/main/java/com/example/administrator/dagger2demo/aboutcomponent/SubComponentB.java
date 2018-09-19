package com.example.administrator.dagger2demo.aboutcomponent;

import dagger.Subcomponent;

/**
 * Author：liguoying
 * Data: 18-7-19 22:34
 */

@Subcomponent(modules = ModuleSubComponentB.class)
public interface SubComponentB {
    void injectActivity(ShowDiffComponentActivity mActivity);
}

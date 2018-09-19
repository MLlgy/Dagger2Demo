package com.example.administrator.dagger2demo.aboutcomponent;

import dagger.Subcomponent;

@Subcomponent(modules = ModuleSubComponentA.class)
public interface SubComponentA {

    void injectActivity(ShowDiffComponentActivity mActivity);
}

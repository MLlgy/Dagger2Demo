package com.example.administrator.dagger2demo.practiceSixth.componentSubcom;

import dagger.Subcomponent;

/**
 * Author：Administrator
 * Data: 2018/9/25 0025 11:00
 */


@Subcomponent(modules = SubModule.class)
public interface SubComponent {
    void injectSubComponentActivity(ComponentSubActivity mDepActivity);
}

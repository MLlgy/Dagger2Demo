package com.example.administrator.dagger2demo.practiceSixth.componentDependy;

import dagger.Component;

/**
 * Author：Administrator
 * Data: 2018/9/25 0025 11:00
 */


@Component(dependencies = AllComponent.class, modules = SubModule.class)
public interface SubComponent {
    void injectSubComponentActivity(ComponentDepActivity mDepActivity);
}

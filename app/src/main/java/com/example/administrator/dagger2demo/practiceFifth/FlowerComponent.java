package com.example.administrator.dagger2demo.practiceFifth;

import dagger.Component;

/**
 * Author：Administrator
 * Data: 2018/9/19 0019 17:24
 */

@Component(modules = FlowersModule.class)
public interface FlowerComponent {

    void inject(FlowerScopeActivity mFlowerScopeActivity);
}

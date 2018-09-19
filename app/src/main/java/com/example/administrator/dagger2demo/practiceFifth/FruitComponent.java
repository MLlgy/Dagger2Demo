package com.example.administrator.dagger2demo.practiceFifth;

import dagger.Component;

/**
 * Author：Administrator
 * Data: 2018/9/19 0019 16:41
 */
@TestScope
@Component(modules = {FruitModule.class})
public interface FruitComponent {

    void inject(TestScopeActivity mTestScopeActivity);
}

package com.example.administrator.dagger2demo.practiceSixth.componentSubcom;

import dagger.Component;

/**
 * Author：Administrator
 * Data: 2018/9/25 0025 11:00
 */


@Component(modules = AllModule.class)
public interface AllComponent {
    SubComponent addSub(SubModule mSubModule);
}

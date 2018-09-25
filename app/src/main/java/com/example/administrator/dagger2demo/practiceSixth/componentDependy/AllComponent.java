package com.example.administrator.dagger2demo.practiceSixth.componentDependy;

import dagger.Component;

/**
 * Author：Administrator
 * Data: 2018/9/25 0025 11:00
 */


@Component(modules = AllModule.class)
public interface AllComponent {
    AllBean getAllBean();
}

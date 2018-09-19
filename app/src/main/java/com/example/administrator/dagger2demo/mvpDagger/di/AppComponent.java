package com.example.administrator.dagger2demo.mvpDagger.di;

import android.content.Context;

import dagger.Component;

/**
 * Creater: liguoying
 * Time: 2018/5/17 0017 18:07
 */
@Component(modules = AppModule.class)
public interface AppComponent {
    Context getContext();
}

package com.example.administrator.dagger2demo.mvpDagger.Di;

import com.example.administrator.dagger2demo.mvpDagger.views.MvpDaggerActivity;

import dagger.Component;

/**
 * Creater: liguoying
 * Time: 2018/5/17 0017 18:27
 */
@Component(dependencies = AppComponent.class,modules = MinePresentModule.class)
public interface MainComponent {

    MvpDaggerActivity inject(MvpDaggerActivity mMvpDaggerActivity);
}

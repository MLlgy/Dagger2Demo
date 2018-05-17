package com.example.administrator.dagger2demo.mvpDagger.base;

/**
 * Creater: liguoying
 * Time: 2018/5/17 0017 16:42
 */
public interface BaseView<T> {
    void setPresenter(T mPresenter);
}

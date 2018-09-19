package com.example.administrator.dagger2demo.mvpDagger.di;

import com.example.administrator.dagger2demo.mvpDagger.contracts.MineContract;

import dagger.Module;
import dagger.Provides;

/**
 * Creater: liguoying
 * Time: 2018/5/17 0017 18:23
 */
@Module
public class MinePresentModule {
    private final MineContract.View mView;


    public MinePresentModule(MineContract.View mView) {
        this.mView = mView;
    }

    @Provides
    MineContract.View provideContractView(){
        return mView;
    }
}

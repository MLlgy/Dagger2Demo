package com.example.administrator.dagger2demo.mvpDagger.presenters;

import android.util.Log;

import com.example.administrator.dagger2demo.mvpDagger.contracts.MineContract;
import com.example.administrator.dagger2demo.mvpDagger.models.User;

import java.util.logging.Handler;

import javax.inject.Inject;

/**
 * Creater: liguoying
 * Time: 2018/5/17 0017 16:47
 */
public class MinePresenter implements MineContract.Presenter {

    private static final String TAG = "MinePresenter";
    private MineContract.View mView;

    @Inject
    public MinePresenter(MineContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void login(final User mUser) {
        Runnable mRunnable = new Runnable() {
            @Override
            public void run() {
                mView.login_success("success");
                Log.e(TAG, "logined" + mUser.getuName() + " pass " + mUser.getuPwd());
            }
        };

        Thread mThread = new Thread(mRunnable);
        Log.e("start", System.currentTimeMillis() + "");
        try {
            Thread.sleep(500);
        } catch (InterruptedException mE) {
            mE.printStackTrace();
        }
        Log.e("end", System.currentTimeMillis() + "");
        mThread.start();

    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }
}

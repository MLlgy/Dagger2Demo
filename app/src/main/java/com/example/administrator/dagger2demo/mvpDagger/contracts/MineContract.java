package com.example.administrator.dagger2demo.mvpDagger.contracts;

import com.example.administrator.dagger2demo.mvpDagger.models.User;
import com.example.administrator.dagger2demo.mvpDagger.base.BasePresenter;
import com.example.administrator.dagger2demo.mvpDagger.base.BaseView;

/**
 * Creater: liguoying
 * Time: 2018/5/17 0017 16:43
 */
public class MineContract {
    public interface View extends BaseView<Presenter> {
        void login_success(String response);

        void login_failure(String msg);

        void network_exception(int errcode);

        void network_normal();
    }

    public interface Presenter extends BasePresenter {
        void login(User mUser) throws InterruptedException;
    }
}

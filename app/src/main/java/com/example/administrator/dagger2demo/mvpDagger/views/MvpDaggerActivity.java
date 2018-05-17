package com.example.administrator.dagger2demo.mvpDagger.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.administrator.dagger2demo.R;
import com.example.administrator.dagger2demo.mvpDagger.contracts.MineContract;
import com.example.administrator.dagger2demo.mvpDagger.models.User;
import com.example.administrator.dagger2demo.mvpDagger.presenters.MinePresenter;

public class MvpDaggerActivity extends AppCompatActivity implements MineContract.View {
    private static final String TAG = "MvpDaggerActivity";
    private EditText mName;
    private EditText mPassword;
    private Button mSubmit;

    private MinePresenter minePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp_dagger);
        minePresenter = new MinePresenter(this);
        initView();
    }

    private void initView() {
        mName = findViewById(R.id.et_name);
        mPassword = findViewById(R.id.et_password);
        mSubmit = findViewById(R.id.btn_submit);
    }

    public void submit(View view) {
        User user = new User();
        user.setuName(mName.getText().toString());
        user.setuPwd(mPassword.getText().toString());
        minePresenter.login(user);
    }

    @Override
    public void login_success(String response) {
        Log.e(TAG, "login_success: " + response);
    }

    @Override
    public void login_failure(String msg) {

    }

    @Override
    public void network_exception(int errcode) {

    }

    @Override
    public void network_normal() {

    }


    @Override
    public void setPresenter(MineContract.Presenter mPresenter) {
        minePresenter = minePresenter;
    }
}

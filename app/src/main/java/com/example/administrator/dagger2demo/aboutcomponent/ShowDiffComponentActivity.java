package com.example.administrator.dagger2demo.aboutcomponent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.administrator.dagger2demo.R;

public class ShowDiffComponentActivity extends AppCompatActivity {

    private TextView tvPeopele;
    private TextView tvUserA;
    private TextView tvUserB;

    private ComponentA mComponentA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_diff_component);
//        mComponentA =
        initView();
    }

    private void initView() {
        tvPeopele = findViewById(R.id.tv_peope);
        tvUserA = findViewById(R.id.tv_user_a);
        tvUserB = findViewById(R.id.tv_user_b);
    }
}

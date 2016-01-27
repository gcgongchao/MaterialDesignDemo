package com.general.android.materialdesigndemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    private TextView mTvCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
        setUI();
        setListener();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mTvCardView=(TextView)findViewById(R.id.tv_cardview);
    }

    @Override
    protected void setUI() {

    }

    @Override
    protected void setListener() {
        mTvCardView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent=null;
        switch (v.getId()){

            case R.id.tv_cardview:
                intent=new Intent(MainActivity.this,CardViewActivity.class);
                startActivity(intent);
                break;
        }
    }
}

package com.general.android.materialdesigndemo;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    private TextView mTvCardView;
    private TextView mTvTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("MaterialDesign学习代码集合");
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
        mTvTabLayout=(TextView)findViewById(R.id.tv_tablayout);
    }

    @Override
    protected void setUI() {

    }

    @Override
    protected void setListener() {
        mTvCardView.setOnClickListener(this);
        mTvTabLayout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent=null;
        switch (v.getId()){

            case R.id.tv_cardview:
                intent=new Intent(MainActivity.this,CardViewActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_tablayout:
                intent=new Intent(MainActivity.this,TabLayoutActivity.class);
                startActivity(intent);
                break;
        }
    }
}

package com.general.android.materialdesigndemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by GeneralAndroid on 2016/1/27.
 */
public abstract  class BaseActivity extends AppCompatActivity{
    protected Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mContext=BaseActivity.this;
    }
    protected abstract void initData();
    protected abstract void initView();
    protected abstract void setUI();
    protected abstract void setListener();


}

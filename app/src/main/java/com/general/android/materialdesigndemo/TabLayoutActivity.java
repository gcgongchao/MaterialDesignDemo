package com.general.android.materialdesigndemo;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.general.android.materialdesigndemo.adapter.TabFragmentAdapter;

/**
 * Created by GeneralAndroid on 2016/2/1.
 */
public class TabLayoutActivity extends BaseActivity{
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout);
        getSupportActionBar().setTitle("TabLayout");
        initView();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mTabLayout=(TabLayout)findViewById(R.id.tabLayout);
        mViewPager=(ViewPager)findViewById(R.id.vp);
        mViewPager.setAdapter(new TabFragmentAdapter(getSupportFragmentManager()));
        mTabLayout.setupWithViewPager(mViewPager);//setupWithViewPager必须在ViewPager.setAdapter()之后调用
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
    }

    @Override
    protected void setUI() {

    }

    @Override
    protected void setListener() {

    }
}

package com.general.android.materialdesigndemo.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by GeneralAndroid  on 2016/2/1.
 */
public abstract class BaseFragment extends Fragment{
    private Context mContext;
    protected View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=getActivity();
    }
    protected abstract void initData();
    protected abstract void initView();
    protected abstract void setUI();
    protected abstract void setListener();



}

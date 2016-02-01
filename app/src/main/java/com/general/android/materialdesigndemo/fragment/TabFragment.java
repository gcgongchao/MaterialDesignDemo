package com.general.android.materialdesigndemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.general.android.materialdesigndemo.R;

/**
 * Created by GeneralAndroid on 2016/2/1.
 */
public class TabFragment extends BaseFragment{

    public static final String PAGE_INDEX="pageIndex";
    private int mPage;
    private TextView mTextView;
    public static TabFragment newInstance(int page){
        Bundle bundle=new Bundle();
        bundle.putInt(PAGE_INDEX, page);
        TabFragment tabFragment=new TabFragment();
        tabFragment.setArguments(bundle);
        return  tabFragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_tablayout,null);
        initView();
        setUI();
        return view;

    }

    @Override
    protected void initData() {

        mPage=getArguments().getInt(PAGE_INDEX);
    }

    @Override
    protected void initView() {

        mTextView=(TextView)view.findViewById(R.id.tv_page);
    }

    @Override
    protected void setUI() {

        mTextView.setText("第"+mPage+"页");
    }

    @Override
    protected void setListener() {

    }
}

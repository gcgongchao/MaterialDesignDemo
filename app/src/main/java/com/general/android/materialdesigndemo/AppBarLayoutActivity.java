package com.general.android.materialdesigndemo;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.general.android.materialdesigndemo.adapter.RecyclerViewAdapter;
import com.general.android.materialdesigndemo.model.CardViewModel;

import java.util.ArrayList;

/**
 * Created by GeneralAndroid on 2016/2/1.
 *
 */
public class AppBarLayoutActivity extends BaseActivity{
    private ArrayList<CardViewModel> mCardViewModels=new ArrayList<CardViewModel>();
    private RecyclerView mRecyclerView;
    private CollapsingToolbarLayout mCollapsingToolbarLayout;
    private RecyclerViewAdapter mRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appbarlayout);
        getSupportActionBar().setTitle("AppBarLayoutActivity");
        getSupportActionBar().hide();
        initData();
        initView();
        setUI();
    }

    @Override
    protected void initData() {
        if(mCardViewModels.size()>0){
            mCardViewModels.clear();
        }

        for(int i=0;i<10;i++){
            CardViewModel model=new CardViewModel();
            model.setName("第"+i+"个风行妹子");
            mCardViewModels.add(model);
        }

    }

    @Override
    protected void initView() {
        mRecyclerView=(RecyclerView)findViewById(R.id.rv);
        mCollapsingToolbarLayout=(CollapsingToolbarLayout)findViewById(R.id.ctl);

    }

    @Override
    protected void setUI() {
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        // 设置布局管理器
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerViewAdapter=new RecyclerViewAdapter(mContext, mCardViewModels);
        mRecyclerView.setAdapter(mRecyclerViewAdapter);
        mRecyclerViewAdapter.setmOnTvLongClick(new RecyclerViewAdapter.OnTvLongClick() {
            @Override
            public void OnClick(View view, int position) {
                Toast.makeText(mContext,mCardViewModels.get(position).getName()+ "马革裹尸了....", Toast.LENGTH_SHORT).show();
                mCardViewModels.remove(position);
                mRecyclerViewAdapter.notifyItemRemoved(position);
                mRecyclerViewAdapter.notifyDataSetChanged();

            }
        });

        mCollapsingToolbarLayout.setCollapsedTitleTextColor(getResources().getColor(R.color.colorPrimary));
        mCollapsingToolbarLayout.setTitle("GeneralAndroid");
        mCollapsingToolbarLayout.setCollapsedTitleTextColor(getResources().getColor(R.color.write));
        mCollapsingToolbarLayout.setContentScrimColor(getResources().getColor(R.color.colorAccent));

    }

    @Override
    protected void setListener() {

    }
}

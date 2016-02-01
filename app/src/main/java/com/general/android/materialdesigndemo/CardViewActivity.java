package com.general.android.materialdesigndemo;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.general.android.materialdesigndemo.adapter.CardViewAdapter;
import com.general.android.materialdesigndemo.model.CardViewModel;

import java.util.ArrayList;

/**
 * Created by GeneralAndroid on 2016/1/27.
 * CardView相关知识点：
 * Android5.0中向我们介绍了一个全新的控件——CardView,从本质上看，可以将CardView看做是FrameLayout在自身之上
 * 添加了圆角和阴影效果。请注意：CardView被包装为一种布局，并且经常在ListView和RecycleView的Item布局中，作为
 * 一种容器使用。
 * CardView应该被使用在显示层次性的内容时，在显示列表或网格时更应该被选择，因为这些边缘可以使得用户更容易去区分
 * 这些内容。
 * CardView提供了一个默认的elevation(意为CardView的Z轴阴影)和圆角角度，所以每一个卡片都能够在不同的设备上保持
 * 相同的外观。当然，你也可以根据自己的需求去定制这些值。
 * 注意：cardElevation属性被用来决定阴影的大小以及柔和度，以至于可以逼真的模拟出对于深度效果的描述。
 *
 *
 */

public class CardViewActivity extends BaseActivity{
    private ArrayList<CardViewModel> mCardViewModels=new ArrayList<CardViewModel>();
//    private RecyclerView mRecyclerView;
    private ListView mListView;
    private CardViewAdapter mCardViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);
        getSupportActionBar().setTitle("CardView");
        super.mContext=this;
        initData();
        initView();
        setUI();
        setListener();

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
        mCardViewAdapter=new CardViewAdapter(mContext,mCardViewModels);

    }

    @Override
    protected void initView() {
//        mRecyclerView=(RecyclerView)findViewById(R.id.rv_card);
        mListView=(ListView)findViewById(R.id.lv_card);
    }

    @Override
    protected void setUI() {

        mListView.setAdapter(mCardViewAdapter);
    }

    @Override
    protected void setListener() {

    }
}

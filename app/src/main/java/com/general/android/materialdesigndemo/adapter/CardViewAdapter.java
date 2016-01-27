package com.general.android.materialdesigndemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.general.android.materialdesigndemo.R;
import com.general.android.materialdesigndemo.model.CardViewModel;

import java.util.ArrayList;


/**
 * Created by GeneralAndroid on 2016/1/27.
 */
public class CardViewAdapter extends BaseAdapter{
    private Context mContext;
    private ArrayList<CardViewModel> mCardViewModels;

    public CardViewAdapter(Context mContext,ArrayList<CardViewModel> mCardViewModels) {
        this.mCardViewModels = mCardViewModels;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mCardViewModels.size();
    }

    @Override
    public Object getItem(int position) {
        return mCardViewModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewItemHolder viewItemHolder=null;
        if(convertView==null){
            convertView= LayoutInflater.from(mContext).inflate(R.layout.activity_cardview_item,null);
            viewItemHolder=new ViewItemHolder();
//            viewItemHolder.mIvImg=(ImageView)convertView.findViewById(R.id.iv_dota);
            viewItemHolder.mTvName=(TextView)convertView.findViewById(R.id.tv_dota);
            convertView.setTag(viewItemHolder);
        }else{
            viewItemHolder=(ViewItemHolder)convertView.getTag();
        }
        viewItemHolder.mTvName.setText(mCardViewModels.get(position).getName());
        return convertView;
    }
    private static class ViewItemHolder{
//        private ImageView mIvImg;
        private TextView mTvName;
    }
}

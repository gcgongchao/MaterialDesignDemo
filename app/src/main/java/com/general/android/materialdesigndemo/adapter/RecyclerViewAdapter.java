package com.general.android.materialdesigndemo.adapter;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.general.android.materialdesigndemo.R;
import com.general.android.materialdesigndemo.model.CardViewModel;

import java.util.ArrayList;

/**
 * Created by GeneralAndroid on 2016/2/1.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private Context mContext;
    private ArrayList<CardViewModel> mCardViewModels;
    private OnTvLongClick mOnTvLongClick=null;
    public interface OnTvLongClick{

        void OnClick(View view,int position);
    }


    public RecyclerViewAdapter(Context mContext,ArrayList<CardViewModel> mCardViewModels) {
        this.mContext=mContext;
        this.mCardViewModels = mCardViewModels;
    }

    public void setmOnTvLongClick(OnTvLongClick mOnTvLongClick) {
        this.mOnTvLongClick = mOnTvLongClick;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(mContext).inflate(R.layout.activity_cardview_item,null);
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder,   int position) {


        holder.mTvName.setText(mCardViewModels.get(position).getName());
        holder.mTvName.setTag(position);
        holder.mTvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos=(Integer)v.getTag();
                Log.e("gc","onCLikc::"+pos);
                Snackbar.make(v, mCardViewModels.get(pos).getName(), Snackbar.LENGTH_LONG).setAction("疾风步", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(mContext, "疾风步开跑....", Toast.LENGTH_SHORT).show();
                    }
                }).show();
            }
        });
        holder.mTvName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int pos=(Integer)v.getTag();
                if(mOnTvLongClick!=null){
                    mOnTvLongClick.OnClick(v,pos);
                }
                return false;
            }
        });


    }

    @Override
    public int getItemCount() {
        return mCardViewModels.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView mTvName;
        public ViewHolder(View itemView) {
            super(itemView);
            mTvName=(TextView)itemView.findViewById(R.id.tv_dota);
        }
    }
}

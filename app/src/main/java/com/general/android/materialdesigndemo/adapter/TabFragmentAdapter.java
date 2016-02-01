package com.general.android.materialdesigndemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.general.android.materialdesigndemo.fragment.TabFragment;

/**
 * Created by GeneralAndroid on 2016/2/1.
 */
public class TabFragmentAdapter extends FragmentPagerAdapter{
    public final int COUNT=10;
    private String[] tabs=new String[]{"Tab1","Tab2","Tab3","Tab4","Tab5","Tab6","Tab7","Tab8","Tab9","Tab10"};

    public TabFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TabFragment.newInstance(position+1);
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}

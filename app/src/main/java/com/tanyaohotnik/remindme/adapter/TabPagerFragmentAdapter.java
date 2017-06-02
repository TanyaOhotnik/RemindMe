package com.tanyaohotnik.remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.tanyaohotnik.remindme.fragment.NotificationFragment;

/**
 * Created by Tanya Ohotnik on 02.06.2017.
 */

public class TabPagerFragmentAdapter extends FragmentPagerAdapter {
    private String[] tabs;

    public TabPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
          "Tab1", "Tab2","Tab3"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
       switch (position){
           case 0: fragment =  NotificationFragment.getInstance(); break;
           case 1: fragment =  NotificationFragment.getInstance();break;
           case 2: fragment = NotificationFragment.getInstance();break;
       }
        return fragment;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}

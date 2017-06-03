package com.tanyaohotnik.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.SparseArray;
import android.util.SparseIntArray;

import com.tanyaohotnik.remindme.fragment.AbstractTabFragment;
import com.tanyaohotnik.remindme.fragment.BirthdaysFragment;
import com.tanyaohotnik.remindme.fragment.HistoryFragment;
import com.tanyaohotnik.remindme.fragment.IdeasFragment;
import com.tanyaohotnik.remindme.fragment.TodoFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tanya Ohotnik on 02.06.2017.
 */

public class TabsFragmentAdapter extends FragmentPagerAdapter {
    private SparseArray<AbstractTabFragment> tabs;
    private Context mContext;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
        tabs = new SparseArray<>();
        initTabArray(context);
    }

    private void initTabArray(Context context) {
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}

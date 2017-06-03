package com.tanyaohotnik.remindme.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * Created by Tanya Ohotnik on 03.06.2017.
 */

public class AbstractTabFragment extends Fragment {
    protected String title;
    protected Context mContext;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setContext(Context context) {
        mContext = context;
    }
}

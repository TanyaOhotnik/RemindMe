package com.tanyaohotnik.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tanyaohotnik.remindme.R;

/**
 * Created by Tanya Ohotnik on 02.06.2017.
 */

public class IdeasFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_history;

    public static IdeasFragment getInstance(Context context){
        Bundle args = new Bundle();
        IdeasFragment fragment = new IdeasFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_ideas));
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(LAYOUT, container, false);
        return view;
    }

}

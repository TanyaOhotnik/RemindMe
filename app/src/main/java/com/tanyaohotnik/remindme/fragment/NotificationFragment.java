package com.tanyaohotnik.remindme.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tanyaohotnik.remindme.R;

/**
 * Created by Tanya Ohotnik on 02.06.2017.
 */

public class NotificationFragment extends Fragment {
    private static final int LAYOUT = R.layout.fragment_notification;
    public static NotificationFragment getInstance(){
        Bundle args = new Bundle();
        NotificationFragment fragment = new NotificationFragment();
        fragment.setArguments(args);
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

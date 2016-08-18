package com.bignerdranch.android.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {

    private static final String TAG = "FOOBAR!";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        Log.d(TAG, "ONCREATE BEING CALLED FROM FRAGMENT");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "ONPAUSE BEING CALLED FROM FRAGMENT");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_layout, container, false);
        return inflate;
    }
}

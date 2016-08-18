package com.bignerdranch.android.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private FrameLayout mFrameLayout;
    private Fragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mFrameLayout present in portrait mode but not landscape
        mFrameLayout = (FrameLayout) findViewById(R.id.fragment_container);
        mFragment = getFragmentManager().findFragmentById(R.id.fragment_container);
        if (mFrameLayout != null && mFragment == null) {
            getFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_container, new MainFragment())
                    .commit();
        } else {
            //skip adding the fragment
        }
    }

}

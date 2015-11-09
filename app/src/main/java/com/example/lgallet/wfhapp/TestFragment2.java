package com.example.lgallet.wfhapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Lgallet on 2015-11-09.
 */
public class TestFragment2 extends Fragment {
    public TestFragment2(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.test_fragment2, container, false);

        return rootView;
    }
}

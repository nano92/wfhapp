package com.example.lgallet.wfhapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Lgallet on 2015-11-09.
 */
public class TestFragment extends Fragment  {
    ListView mainListView;
    ArrayAdapter mArrayAdapter;

    public TestFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.test_fragment, container, false);
        mainListView = (ListView) rootView.findViewById(R.id.listView);


        return rootView;
    }

    private void setList(){


      //  mArrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,);

       // mainListView.setOnItemClickListener();
       // mainListView.setAdapter(mArrayAdapter);
    }



}


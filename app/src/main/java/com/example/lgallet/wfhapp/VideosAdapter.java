package com.example.lgallet.wfhapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Lgallet on 2015-11-09.
 */
public class VideosAdapter extends ArrayAdapter<Object> {

    public VideosAdapter(Context context) {
        super(context, 0);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;


        return view;
    }

    @Override
    public int getItemViewType(int position) {
        return (getItem(position) instanceof HighlightsVideos) ? 1 : 0;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

}

/*private static class Header {

    public final String name;

    public Header(String name) {
        this.name = name;
    }

}*/
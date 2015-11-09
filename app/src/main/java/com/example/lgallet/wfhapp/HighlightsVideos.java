package com.example.lgallet.wfhapp;

import java.util.ArrayList;

/**
 * Created by Lgallet on 2015-11-09.
 */
public class HighlightsVideos {

    private static String name;
    private String url;
    private ArrayList<HighlightsVideos> vList = new ArrayList<>();

    public HighlightsVideos(String name, String url){
        this.name = name;
        this.url = url;
    }

    public ArrayList<HighlightsVideos> createList(){
        vList.add(new HighlightsVideos("sample video", "http://techslides.com/demos/sample-videos/small.mp4"));

        return vList;
    }
}

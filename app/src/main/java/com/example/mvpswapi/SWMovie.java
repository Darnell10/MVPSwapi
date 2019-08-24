package com.example.mvpswapi;

public class SWMovie {

    private int id;

    private int episode;

    private String title;

    private String tagLine;

    public SWMovie(int id, int episode, String title, String tagLine) {
        this.id = id;
        this.episode = episode;
        this.title = title;
        this.tagLine = tagLine;
    }

    public static SWMovie EMPTY(){
        return new SWMovie(0,0,"", "");
    }
}

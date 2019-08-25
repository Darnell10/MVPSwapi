package com.example.mvpswapi.data;

public class SWMovie {


    private String title;



    public SWMovie( String title) {

        this.title = title;

    }

    public String getTitle() {
        return title;
    }


    public static SWMovie EMPTY(){
        return new SWMovie("");
    }
}

package com.example.mvpswapi;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class MainPresenter implements MainContract.Presenter {

    private final MainContract.View view;

    public MainPresenter(@NonNull MainContract.View view) {

        this.view = view;
    }


    @Override
    public void getMovies() {
        boolean success = false;
        List<SWMovie> movieList = new ArrayList<>();

        if (success){
            view.showMovies(movieList);
        } else {
            view.showError();
        }

//        view.showError();
//        view.showMovies();
        //TODO : retrofit call
        //TODO : if successfull show movies

    }
}

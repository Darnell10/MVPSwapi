package com.example.mvpswapi;

import androidx.annotation.NonNull;

import com.example.mvpswapi.data.SWMovie;
import com.example.mvpswapi.networking.SwapiApi;

import java.util.List;

public class MainPresenter implements MainContract.Presenter {

    private final MainContract.View view;
    private final SwapiApi api;

    public MainPresenter (
        @NonNull final MainContract.View view,
        @NonNull final SwapiApi swapiApi
    ){
        this.view = view;
        this.api = swapiApi;
    }



    @Override
    public void getMovies() {
        List<SWMovie> movieList = api.getSwapiStuff();
        final boolean success = movieList != null && !movieList.isEmpty();

        if (success) {
            view.showMovies(movieList);
        } else {
            view.showError();
        }

//        view.showError();
//        view.showMovies();
        //TODO : retrofit call
        //TODO : if successful show movies

    }
}

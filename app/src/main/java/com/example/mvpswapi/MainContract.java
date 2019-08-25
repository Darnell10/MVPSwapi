package com.example.mvpswapi;

import com.example.mvpswapi.data.SWMovie;

import java.util.List;

public interface MainContract {


    interface View {

        void showMovies(List<SWMovie> movies);

        void showError();
    }

    interface Presenter{

        void getMovies();
    }
}

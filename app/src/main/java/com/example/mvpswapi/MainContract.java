package com.example.mvpswapi;

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

package com.example.mvpswapi;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvpswapi.data.SWMovie;
import com.example.mvpswapi.networking.SwapiApi;
import com.example.mvpswapi.recyclerview.MovieAdapter;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainPresenter implements MainContract.Presenter {


    private final MainContract.View view;
    private final SwapiApi api;

    public MainPresenter(@NonNull final MainContract.View view, @NonNull final SwapiApi swapiApi) {
        this.view = view;
        this.api = swapiApi;
    }



    @SuppressLint("CheckResult")
    @Override
    public void getMovies() {
        api.getSWMovies()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(response -> {
                    final List<SWMovie> movieList = response.getMovies();
                    final boolean success = movieList != null && !movieList.isEmpty();

                    if (success) {
                        view.showMovies(movieList);
                    } else {
                        view.showError();
                    }
                }, error -> {
                    view.showError();
                });


    }





}


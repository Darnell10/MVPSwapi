package com.example.mvpswapi.networking;

import com.example.mvpswapi.data.MovieResponse;
import com.example.mvpswapi.data.SWMovie;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface SwapiApi {


    @GET("films/")
    Single<MovieResponse> getSWMovies();
}

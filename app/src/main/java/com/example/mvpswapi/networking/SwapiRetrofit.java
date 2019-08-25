package com.example.mvpswapi.networking;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class SwapiRetrofit {

    private static String SWAPI_BASE_URL = "https://swapi.co/api/";

    private static Retrofit retrofitInstance;

    private SwapiRetrofit(){

    }

    public static Retrofit getRetrofit(){
        if (retrofitInstance == null){
            retrofitInstance = new Retrofit.Builder()
                    .baseUrl(SWAPI_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return retrofitInstance;
    }


}

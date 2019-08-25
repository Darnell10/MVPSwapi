package com.example.mvpswapi.networking;

import com.example.mvpswapi.data.SWMovie;

import java.util.List;

public interface SwapiApi {

    //GET("SomeEndPoint")

    List<SWMovie> getSwapiStuff();
}

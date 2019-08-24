package com.example.mvpswapi.data;

import com.example.mvpswapi.SWMovie;

import java.util.List;

public interface SwapiApi {

    //GET("SomeEndPoint")

    List<SWMovie> getSwapiStuff();
}

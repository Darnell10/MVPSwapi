package com.example.mvpswapi.data;

import java.util.List;

public class MovieResponse {

    private final List<SWMovie> results;

    public MovieResponse(List<SWMovie> results) {
        this.results = results;
    }

    public List<SWMovie> getMovies() {
        return results;
    }
}

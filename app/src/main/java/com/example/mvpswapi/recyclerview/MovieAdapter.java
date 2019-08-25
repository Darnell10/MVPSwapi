package com.example.mvpswapi.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvpswapi.R;
import com.example.mvpswapi.data.SWMovie;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<Movie_Holder> {

    private List<SWMovie> swMovieList;

    public MovieAdapter(List<SWMovie> swMovieList) {
        this.swMovieList = swMovieList;
    }

    @NonNull
    @Override
    public Movie_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main, parent, false);
        return new Movie_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Movie_Holder holder, int position) {

        holder.onBind(swMovieList.get(position));
    }

    @Override
    public int getItemCount() {
        return swMovieList.size();
    }
}

package com.example.mvpswapi.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvpswapi.R;
import com.example.mvpswapi.data.SWMovie;

public class Movie_Holder extends RecyclerView.ViewHolder {

    private TextView movieTitle;

    public Movie_Holder(@NonNull View itemView) {
        super(itemView);

        movieTitle = itemView.findViewById(R.id.movie_title);
    }

    public void onBind(SWMovie swMovie){
        movieTitle.setText(swMovie.getTitle());
    }
}

package com.example.mvpswapi;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvpswapi.data.MovieResponse;
import com.example.mvpswapi.data.SWMovie;
import com.example.mvpswapi.networking.SwapiApi;
import com.example.mvpswapi.networking.SwapiRetrofit;
import com.example.mvpswapi.recyclerview.MovieAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter presenter;

    private RecyclerView recyclerView;

    private MovieAdapter movieAdapter;

    private List<SWMovie> movieList;

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SwapiApi swapiApi = SwapiRetrofit.getRetrofit()
                .create(SwapiApi.class);

        presenter = new MainPresenter(this,swapiApi);

        presenter.getMovies();

        setRecyclerView(movieList);
    }



    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void showMovies(@NonNull List<SWMovie> movies) {
        String titles = "";

        for (SWMovie movie : movies) {
            titles += "\n" + movie.getTitle();

        }

        //(textView = findViewById(R.id.main_text)).setText(titles);

        Toast.makeText(this, textView.getText(), Toast.LENGTH_SHORT).show();
        //TODO: recycleView Stuff

    }

//    public void setRecyclerView(List<SWMovie> swMovies){
//        recyclerView = findViewById(R.id.movie_rv);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()
//                ,LinearLayoutManager.VERTICAL,false));
//        recyclerView.setAdapter(new MovieAdapter(swMovies));
//
//    }

    private void setRecyclerView(List<SWMovie> swMovies){
        movieAdapter = new MovieAdapter(swMovies);
        recyclerView.setAdapter(movieAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,
                false));

    }
    @Override
    public void showError() {
        Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
        //TODO: show/hide view stuff
    }
}

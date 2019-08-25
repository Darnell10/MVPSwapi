package com.example.mvpswapi;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvpswapi.data.SWMovie;
import com.example.mvpswapi.networking.SwapiApi;
import com.example.mvpswapi.networking.SwapiRetrofit;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter presenter;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SwapiApi swapiApi = SwapiRetrofit.getRetrofit()
                .create(SwapiApi.class);

        presenter = new MainPresenter(this,swapiApi);

        presenter.getMovies();
    }



    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void showMovies(List<SWMovie> movies) {
        String titles = "";

        for (SWMovie movie : movies) {
            titles += "\n" + movie.getTitle();
        }

        textView = findViewById(R.id.movie_title);
        textView.setText(titles);

        Toast.makeText(this, "Success", Toast.LENGTH_LONG).show();
        //TODO: recycleView Stuff

    }

    @Override
    public void showError() {
        Toast.makeText(this,"Error",Toast.LENGTH_LONG).show();
        //TODO: show/hide view stuff
    }
}

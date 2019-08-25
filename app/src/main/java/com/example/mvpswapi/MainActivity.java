package com.example.mvpswapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.mvpswapi.data.SWMovie;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private final MainContract.Presenter presenter = new MainPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter.getMovies();
    }

    @Override
    public void showMovies(List<SWMovie> movies) {
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
        //TODO: recycleView Stuff

    }

    @Override
    public void showError() {
        Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
        //TODO: show/hide view stuff
    }
}

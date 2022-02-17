package de.florianten.quizapp.view.start;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import de.florianten.quizapp.R;

public class StartActivityView extends AppCompatActivity implements StartActivityContract {

    private StartActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_view);

        getSupportActionBar().hide();

        presenter = new StartActivityPresenter();
    }
}
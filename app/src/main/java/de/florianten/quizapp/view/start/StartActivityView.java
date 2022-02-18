package de.florianten.quizapp.view.start;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import de.florianten.quizapp.R;

public class StartActivityView extends AppCompatActivity implements StartActivityContract {

    private StartActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_view);

        presenter = new StartActivityPresenter();
    }

    @Override
    public void switchPage(Class<? extends Activity> destinationClass) {
        Intent intent = new Intent(this, destinationClass);
        startActivity(intent);
    }
}
package de.florianten.quizapp.view.solo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import de.florianten.quizapp.R;

public class SoloActivityView extends AppCompatActivity implements SoloActivityContract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_solo);
        getSupportActionBar().hide();
        //findviewbyid
}

//get methods
}

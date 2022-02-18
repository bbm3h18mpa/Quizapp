package de.florianten.quizapp.view.menu;

import static androidx.navigation.fragment.FragmentKt.findNavController;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import de.florianten.quizapp.R;

public class MenuActivityView extends AppCompatActivity implements MenuActivityContract.View{
    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate( Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.bottom_nav);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavMethod);

    }
    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavMethod = new
            BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment fragment = null;
                    switch (item.getItemId()){
                        case R.id.soloFragment:
                            fragment = new SoloFragment();
                            break;
                        case R.id.duoFragment:
                            fragment = new DuoFragment();
                            break;
                        case R.id.settingsFragment:
                            fragment = new SettingsFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();
                    return true;
                }
            };

}

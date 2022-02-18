package de.florianten.quizapp.view.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import de.florianten.quizapp.R;

public class LoginActivityView  extends AppCompatActivity implements LoginActivityContract.View{

    private Button loginButton;
    private EditText mail;
    private EditText password;
    private TextView toRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        loginButton = findViewById(R.id.loginButton);
        mail = findViewById(R.id.loginMail);
        password = findViewById(R.id.loginPassword);
        toRegister = findViewById(R.id.toRegister);
    }
    @Override
    public Button getLoginButton(){ return loginButton;}
    @Override
    public EditText getMail(){ return mail;}
    @Override
    public EditText getPassword(){ return password; }
    @Override
    public TextView getToRegister(){ return toRegister;}

    @Override
    public void switchPage(Class<? extends Activity> destinationClass) {
        Intent intent = new Intent(this, destinationClass);
        startActivity(intent);
    }

    @Override
    public void test(){
        Toast.makeText(this, "du hurensohn android", Toast.LENGTH_SHORT).show();
    }
}

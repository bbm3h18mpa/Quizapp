package de.florianten.quizapp.view.register;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import de.florianten.quizapp.R;

public class RegisterActivityView extends AppCompatActivity implements RegisterActivityContract.View{

    private RegisterActivityContract.Presenter presenter;
    private Button RegisterButton;
    private EditText name;
    private EditText mail;
    private EditText password;
    private EditText passwordRepeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();

        RegisterButton = findViewById(R.id.register);
        name = findViewById(R.id.name);
        mail = findViewById(R.id.mail);
        password = findViewById(R.id.password);
        passwordRepeat = findViewById(R.id.passwordRepeat);
    }
    @Override
    public Button getRegisterButton(){
        return RegisterButton;
    }
    @Override
    public EditText getName(){
        return name;
    }
    @Override
    public  EditText getMail(){
        return mail;
    }
    @Override
    public EditText getPassword(){
        return password;
    }
    @Override
    public EditText getPasswordRepeat(){
        return passwordRepeat;
    }
}
package de.florianten.quizapp.view.login;

import de.florianten.quizapp.model.Model;
import android.view.View;

public class LoginActivityPresenter implements LoginActivityContract.Presenter{
    private final LoginActivityContract.View view;
    private final Model model = new Model();

    public LoginActivityPresenter(LoginActivityContract.View view){
        this.view = view;
    }
    @Override
    public void setListeners(){
        view.getLoginButton().setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               //Presenter talks to the model
           }
        });
    }
}

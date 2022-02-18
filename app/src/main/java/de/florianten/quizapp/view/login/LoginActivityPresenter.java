package de.florianten.quizapp.view.login;

import de.florianten.quizapp.model.Model;
import de.florianten.quizapp.view.menu.MenuActivityView;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class LoginActivityPresenter  implements LoginActivityContract.Presenter{
    private final LoginActivityContract.View view;
    private final Model model = new Model();

    public LoginActivityPresenter(LoginActivityContract.View view){
        this.view = view;
    }
    @Override
    public void setListeners() {
        view.getLoginButton().setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               //Presenter talks to the model/view
               view.test();
               view.switchPage(MenuActivityView.class);
           }
        });
    }

}

package de.florianten.quizapp.view.login;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public interface LoginActivityContract {

    public interface View{
        Button getLoginButton();
        EditText getMail();
        EditText getPassword();
        TextView getToRegister();

        void switchPage(Class<? extends Activity> destinationClass);

        void test();
    }

    public interface Presenter{
        void setListeners();
    }
}

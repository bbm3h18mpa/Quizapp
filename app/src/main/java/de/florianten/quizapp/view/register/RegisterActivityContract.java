package de.florianten.quizapp.view.register;


import android.widget.Button;
import android.widget.EditText;

public interface RegisterActivityContract {
    public interface View {
        Button getRegisterButton();
        EditText getName();
        EditText getMail();
        EditText getPassword();
        EditText getPasswordRepeat();
    }

    public interface Presenter{
        void setListeners();
    }
}

package de.florianten.quizapp.view.register;

import de.florianten.quizapp.model.Model;
import android.view.View;

public class RegisterActivityPresenter implements RegisterActivityContract.Presenter{
    private final RegisterActivityContract.View view;
    private final Model model = new Model();

    public RegisterActivityPresenter(RegisterActivityContract.View view) {
        this.view = view;
    }
        @Override
        public void setListeners() {
            view.getRegisterButton().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Presenter talks to the model

                }
            });
    }
}


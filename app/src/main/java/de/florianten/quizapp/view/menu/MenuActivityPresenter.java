package de.florianten.quizapp.view.menu;

import android.view.View;

import de.florianten.quizapp.model.Model;


public class MenuActivityPresenter implements MenuActivityContract.Presenter{
    private final MenuActivityContract.View view;
    private final Model model = new Model();

    public MenuActivityPresenter(MenuActivityContract.View view){ this.view = view; }
    @Override
    public void setListener() {

    }
}

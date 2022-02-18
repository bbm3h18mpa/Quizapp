package de.florianten.quizapp.view.Duo;

import de.florianten.quizapp.model.Model;

public class DuoActivityPresenter implements DuoActivityContract.Presenter{
    private final DuoActivityContract.View view;
    private final Model model = new Model();

    public DuoActivityPresenter(DuoActivityContract.View view) { this.view = view; }

    @Override
    public void setListeners() {

    }
}

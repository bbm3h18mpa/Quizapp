package de.florianten.quizapp.view.game;

import de.florianten.quizapp.model.Model;

public class GameActivityPresenter implements GameActivityContract.Presenter{
    private final GameActivityContract.View view;
    private final Model model = new Model();

    public GameActivityPresenter(GameActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void setListeners() {

    }
}

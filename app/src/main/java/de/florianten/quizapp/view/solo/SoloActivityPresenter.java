package de.florianten.quizapp.view.solo;

import de.florianten.quizapp.model.Model;

public class SoloActivityPresenter implements SoloActivityContract.Presenter{

    private final SoloActivityContract.View view;
    private final Model model = new Model();

    public SoloActivityPresenter(SoloActivityContract.View view){ this.view = view;}
    @Override
    public void setListeners(){

    }
}

package de.florianten.quizapp.view.start;

import android.app.Activity;

public interface StartActivityContract {
    void switchPage(Class<? extends Activity> destinationClass);
}

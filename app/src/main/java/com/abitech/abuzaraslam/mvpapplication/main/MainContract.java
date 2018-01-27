package com.abitech.abuzaraslam.mvpapplication.main;

import android.view.View;

/**
 * Defines the contract between view and {@link MainActivity}
 * and the Presenter {@link MainPresenter}
 */

public interface MainContract {

    interface MvpView {

        void ShowSignInScreen();
        void ShowSignUpScreen();

    }

    interface Presenter {

        void handleSignInButtonClick(View view);
        void handleSignUpButtonClick(View view);

    }

}

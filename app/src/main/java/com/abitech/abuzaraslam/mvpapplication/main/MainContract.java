package com.abitech.abuzaraslam.mvpapplication.main;

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

        void handleSignInButtonClick();
        void handleSignUpButtonClick();

    }

}

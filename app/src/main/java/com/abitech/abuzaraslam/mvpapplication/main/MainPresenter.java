package com.abitech.abuzaraslam.mvpapplication.main;

import com.abitech.abuzaraslam.mvpapplication.main.MainContract;

/**
 * Responsible for handling the action from the View and updating the UI as required.
 */

public class MainPresenter implements MainContract.Presenter {



    private MainContract.MvpView mView;


    MainPresenter(MainContract.MvpView mview)
    {
        this.mView=mview;
    }


    //////Presenter methods   ///////
    @Override
    public void handleSignInButtonClick() {

        mView.ShowSignInScreen();
    }

    @Override
    public void handleSignUpButtonClick() {

        mView.ShowSignUpScreen();
    }
}

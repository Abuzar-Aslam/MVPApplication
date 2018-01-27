package com.abitech.abuzaraslam.mvpapplication.main;

import android.view.View;

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
    public void handleSignInButtonClick(View view) {

        mView.ShowSignInScreen();
    }

    @Override
    public void handleSignUpButtonClick(View view) {

        mView.ShowSignUpScreen();
    }
}

package com.abitech.abuzaraslam.mvpapplication.main;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Local unit test for the Main Presenter.
 */
public class MainPresenterTest {

    @Mock
    private  MainContract.MvpView mView;

    private  MainPresenter mPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mPresenter=new MainPresenter(mView);


    }

    @Test
    public void handleSignInButtonClick() throws Exception {
    mPresenter.handleSignInButtonClick();
    verify(mView).ShowSignInScreen();
    }

    @Test
    public void handleSignUpButtonClick() throws Exception {
        mPresenter.handleSignUpButtonClick();
        verify(mView).ShowSignUpScreen();
    }

}
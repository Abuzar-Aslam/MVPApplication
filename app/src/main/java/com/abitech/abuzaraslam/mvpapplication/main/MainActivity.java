package com.abitech.abuzaraslam.mvpapplication.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.abitech.abuzaraslam.mvpapplication.R;

/**
 * Displays the main screen
 */

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {


    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter=new MainPresenter(this);

    }

    //// MvpView Methods /////
    @Override
    public void ShowSignInScreen() {
        Toast.makeText(this,"Taking user to the Sign In screen",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void ShowSignUpScreen() {
        Toast.makeText(this,"Taking user to the Sign Up screen",Toast.LENGTH_SHORT).show();
    }
}

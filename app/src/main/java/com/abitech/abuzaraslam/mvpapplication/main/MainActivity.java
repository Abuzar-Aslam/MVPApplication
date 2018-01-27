package com.abitech.abuzaraslam.mvpapplication.main;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.abitech.abuzaraslam.mvpapplication.R;
import com.abitech.abuzaraslam.mvpapplication.databinding.MainActivityBinding;

/**
 * Displays the main screen
 */

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {


    private MainPresenter mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityBinding binding= DataBindingUtil.setContentView(this,R.layout.main_activity);
        mPresenter=new MainPresenter(this);
        binding.setPresenter(mPresenter);



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

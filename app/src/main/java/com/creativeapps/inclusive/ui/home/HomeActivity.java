package com.creativeapps.inclusive.ui.home;

import android.os.Bundle;

import com.creativeapps.inclusive.DefaultApplication;
import com.creativeapps.inclusive.R;
import com.creativeapps.inclusive.ui.BaseActivity;

import javax.inject.Inject;

public class HomeActivity extends BaseActivity implements HomeView {
    @Inject
    HomePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DefaultApplication.getAppComponent().inject(this);

        presenter.setView(this);
    }

}

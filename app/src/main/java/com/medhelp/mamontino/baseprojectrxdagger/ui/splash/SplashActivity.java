package com.medhelp.mamontino.baseprojectrxdagger.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.medhelp.mamontino.baseprojectrxdagger.R;
import com.medhelp.mamontino.baseprojectrxdagger.ui.base.BaseActivity;
import com.medhelp.mamontino.baseprojectrxdagger.ui.login.LoginActivity;

import javax.inject.Inject;

import timber.log.Timber;

public class SplashActivity extends BaseActivity implements SplashViewHelper
{
    @Inject
    SplashPresenterHelper<SplashViewHelper> presenter;

    public static Intent start(Context context)
    {
        return new Intent(context, SplashActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Timber.d("onCreate");
        setContentView(R.layout.activity_splash);
        getActivityComponent().inject(this);
        setUp();
    }

    @Override
    public void openLoginActivity()
    {
        Timber.d("openLoginActivity");
        Intent intent = LoginActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDestroy()
    {
        Timber.d("onDestroy");
        presenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp()
    {
        Timber.d("setUp");
        presenter.onAttach(SplashActivity.this);
    }
}

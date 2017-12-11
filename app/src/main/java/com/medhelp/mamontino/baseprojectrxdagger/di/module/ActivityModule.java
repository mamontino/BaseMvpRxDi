package com.medhelp.mamontino.baseprojectrxdagger.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.medhelp.mamontino.baseprojectrxdagger.di.scope.PerActivity;
import com.medhelp.mamontino.baseprojectrxdagger.ui.login.LoginPresenter;
import com.medhelp.mamontino.baseprojectrxdagger.ui.login.LoginPresenterHelper;
import com.medhelp.mamontino.baseprojectrxdagger.ui.login.LoginViewHelper;
import com.medhelp.mamontino.baseprojectrxdagger.ui.splash.SplashPresenter;
import com.medhelp.mamontino.baseprojectrxdagger.ui.splash.SplashPresenterHelper;
import com.medhelp.mamontino.baseprojectrxdagger.ui.splash.SplashViewHelper;
import com.medhelp.mamontino.baseprojectrxdagger.utils.rx.AppSchedulerProvider;
import com.medhelp.mamontino.baseprojectrxdagger.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;


@Module
public class ActivityModule
{
    private AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity)
    {
        this.activity = activity;
    }

    @PerActivity
    @Provides
    Context provideContext()
    {
        return activity;
    }

    @PerActivity
    @Provides
    AppCompatActivity provideActivity()
    {
        return activity;
    }

    @PerActivity
    @Provides
    CompositeDisposable provideCompositeDisposable()
    {
        return new CompositeDisposable();
    }

    @PerActivity
    @Provides
    SchedulerProvider provideSchedulerProvider()
    {
        return new AppSchedulerProvider();
    }

    @PerActivity
    @Provides
    SplashPresenterHelper<SplashViewHelper> provideSplashPresenter(SplashPresenter<SplashViewHelper> presenter)
    {
        return presenter;
    }

    @PerActivity
    @Provides
    LoginPresenterHelper<LoginViewHelper> provideLoginPresenter(LoginPresenter<LoginViewHelper> presenter)
    {
        return presenter;
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity)
    {
        return new LinearLayoutManager(activity);
    }
}

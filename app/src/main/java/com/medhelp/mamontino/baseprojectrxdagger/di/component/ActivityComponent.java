package com.medhelp.mamontino.baseprojectrxdagger.di.component;


import com.medhelp.mamontino.baseprojectrxdagger.di.module.ActivityModule;
import com.medhelp.mamontino.baseprojectrxdagger.di.scope.PerActivity;
import com.medhelp.mamontino.baseprojectrxdagger.ui.login.LoginActivity;
import com.medhelp.mamontino.baseprojectrxdagger.ui.splash.SplashActivity;

import dagger.Component;


@PerActivity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)

public interface ActivityComponent
{
    void inject(SplashActivity activity);

    void inject(LoginActivity activity);
}

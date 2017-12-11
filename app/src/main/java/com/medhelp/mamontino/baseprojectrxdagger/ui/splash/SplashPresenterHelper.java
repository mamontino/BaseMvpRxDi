package com.medhelp.mamontino.baseprojectrxdagger.ui.splash;

import com.medhelp.mamontino.baseprojectrxdagger.ui.base.MvpPresenter;
import com.medhelp.mamontino.baseprojectrxdagger.di.scope.PerActivity;


@PerActivity
public interface SplashPresenterHelper<V extends SplashViewHelper> extends MvpPresenter<V>
{
}

package com.medhelp.mamontino.baseprojectrxdagger.ui.login;


import com.medhelp.mamontino.baseprojectrxdagger.ui.base.MvpPresenter;
import com.medhelp.mamontino.baseprojectrxdagger.di.scope.PerActivity;

@PerActivity
public interface LoginPresenterHelper<V extends LoginViewHelper> extends MvpPresenter<V>
{
    void onLoginClick(String username, String password);
}

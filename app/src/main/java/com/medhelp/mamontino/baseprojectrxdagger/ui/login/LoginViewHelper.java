package com.medhelp.mamontino.baseprojectrxdagger.ui.login;


import com.medhelp.mamontino.baseprojectrxdagger.ui.base.MvpView;

public interface LoginViewHelper extends MvpView
{
    boolean isNeedSave();

    void closeActivity();

    void openNetworkSettings();
}

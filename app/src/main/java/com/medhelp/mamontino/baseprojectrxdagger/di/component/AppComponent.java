package com.medhelp.mamontino.baseprojectrxdagger.di.component;

import android.app.Application;
import android.content.Context;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.medhelp.mamontino.baseprojectrxdagger.MainApp;
import com.medhelp.mamontino.baseprojectrxdagger.bg.MessagingService;
import com.medhelp.mamontino.baseprojectrxdagger.bg.SyncService;
import com.medhelp.mamontino.baseprojectrxdagger.data.DataHelper;
import com.medhelp.mamontino.baseprojectrxdagger.di.module.AppModule;
import com.medhelp.mamontino.baseprojectrxdagger.di.scope.PerApplication;

import dagger.Component;


@PerApplication
@Component(modules = {AppModule.class})
public interface AppComponent
{
    void inject(MainApp app);

    void inject(MessagingService service);

    void inject(FirebaseMessagingService service);

    void inject(SyncService service);

    @PerApplication
    Context context();

    Application application();

    DataHelper getDataManager();
}
package com.medhelp.mamontino.baseprojectrxdagger.di.component;


import com.medhelp.mamontino.baseprojectrxdagger.bg.MessagingService;
import com.medhelp.mamontino.baseprojectrxdagger.bg.SyncService;
import com.medhelp.mamontino.baseprojectrxdagger.di.module.ActivityModule;
import com.medhelp.mamontino.baseprojectrxdagger.di.module.ServiceModule;
import com.medhelp.mamontino.baseprojectrxdagger.di.scope.PerService;

import dagger.Component;


@PerService
@Component(dependencies = AppComponent.class, modules = {ServiceModule.class, ActivityModule.class})
public interface ServiceComponent
{
    void inject(MessagingService service);

    void inject(SyncService service);
}
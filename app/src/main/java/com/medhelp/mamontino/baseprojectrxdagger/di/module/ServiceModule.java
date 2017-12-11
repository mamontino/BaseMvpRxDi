package com.medhelp.mamontino.baseprojectrxdagger.di.module;


import com.medhelp.mamontino.baseprojectrxdagger.bg.MessagingService;
import com.medhelp.mamontino.baseprojectrxdagger.bg.SyncService;
import com.medhelp.mamontino.baseprojectrxdagger.di.scope.PerService;

import dagger.Module;
import dagger.Provides;


@Module
public class ServiceModule
{
    private MessagingService messagingService;
    private SyncService syncService;

    @PerService
    @Provides
    MessagingService provideMessagingService()
    {
        return messagingService;
    }

    @PerService
    @Provides
    SyncService provideSyncService()
    {
        return syncService;
    }
}

package com.medhelp.mamontino.baseprojectrxdagger.data;


import android.content.Context;

import com.medhelp.mamontino.baseprojectrxdagger.data.db.RealmHelper;
import com.medhelp.mamontino.baseprojectrxdagger.data.network.NetworkHelper;
import com.medhelp.mamontino.baseprojectrxdagger.data.pref.PreferencesHelper;
import com.medhelp.mamontino.baseprojectrxdagger.di.scope.PerApplication;

import javax.inject.Inject;


@PerApplication
public class DataManager implements DataHelper
{
    private final Context context;
    private final PreferencesHelper preferencesHelper;
    private final NetworkHelper networkHelper;
    private final RealmHelper realmHelper;

    @Inject
    DataManager(@PerApplication Context context,
            @PerApplication PreferencesHelper preferencesHelper,
            @PerApplication NetworkHelper networkHelper, @PerApplication RealmHelper realmHelper)
    {
        this.context = context;
        this.preferencesHelper = preferencesHelper;
        this.networkHelper = networkHelper;
        this.realmHelper = realmHelper;
    }

//    @Override
//    public Observable<UserList> doLogin(String username, String password)
//    {
//        return networkHelper.doLogin(username, password);
//    }
//
//    @Override
//    public Observable<List<RoomResponse>> getRoomList()
//    {
//        return networkHelper.getRoomList();
//    }
//
//    @Override
//    public Observable<RoomResponse> getRoomById(int id)
//    {
//        return networkHelper.getRoomById(id);
//    }
//
//    @Override
//    public Single<RoomResponse> getRealmChatRoom(String title)
//    {
//        return realmHelper.getRealmChatRoom(title);
//    }
//
//    @Override
//    public Completable saveRealmUser(UserResponse response)
//    {
//        return realmHelper.saveRealmUser(response);
//    }

    @Override
    public int getCurrentUserId()
    {
        return preferencesHelper.getCurrentUserId();
    }

    @Override
    public void setCurrentUserId(int userId)
    {
        preferencesHelper.setCurrentUserId(userId);
    }

    @Override
    public void addNotification(String notification)
    {
        preferencesHelper.addNotification(notification);
    }

    @Override
    public String getNotifications()
    {
        return preferencesHelper.getNotifications();
    }

    @Override
    public boolean checkNetwork()
    {
        return false;
    }
}

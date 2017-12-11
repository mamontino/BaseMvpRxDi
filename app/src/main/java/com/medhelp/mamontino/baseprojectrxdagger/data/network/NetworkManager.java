package com.medhelp.mamontino.baseprojectrxdagger.data.network;


import com.medhelp.mamontino.baseprojectrxdagger.data.pref.PreferencesManager;
import com.medhelp.mamontino.baseprojectrxdagger.di.scope.PerApplication;

import javax.inject.Inject;

@PerApplication
public class NetworkManager implements NetworkHelper
{
    private PreferencesManager prefManager;

    private static final String ID_CENTER = "id_center";
    private static final String ID_CLIENT = "id_client";
    private static final String ID_DOCTOR = "id_doctor";
    private static final String ID_USER = "id_user";
    private static final String ID_ROOM = "id_room";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static final String FB_TOKEN = "fb_token";
    private static final String MESSAGE = "message";
    private static final String AUTH = "Authorization";


    @Inject
    public NetworkManager(@PerApplication PreferencesManager preferencesManager)
    {
        this.prefManager = preferencesManager;
    }

//    @Override
//    public Observable<UserList> doLogin(String username, String password)
//    {
//        return Rx2AndroidNetworking.post(ApiEndPoint.LOGIN)
//                .addHeaders(AUTH, AppConstants.API_KEY)
//                .addBodyParameter(USERNAME, username)
//                .addBodyParameter(PASSWORD, password)
//                .build()
//                .getObjectObservable(UserList.class);
//    }
//
//    @Override
//    public Observable<List<RoomResponse>> getRoomList()
//    {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ROOM_LIST)
//                .addHeaders(AUTH, prefManager.getAccessToken())
//                .addPathParameter(ID_USER, String.valueOf(prefManager.getCurrentUserId()))
//                .build()
//                .getObjectObservable(RoomList.class)
//                .map(roomList -> (List<RoomResponse>) new ArrayList<>(roomList.getResponses()));
//    }
}


package com.medhelp.mamontino.baseprojectrxdagger.data.db;


import android.content.Context;

import com.medhelp.mamontino.baseprojectrxdagger.di.scope.PerApplication;

import javax.inject.Inject;

import io.realm.RealmConfiguration;


@PerApplication
public class RealmManager implements RealmHelper
{
    private Context context;

    private RealmConfiguration config = new RealmConfig().getConfig();

    @Inject
    public RealmManager(@PerApplication Context context)
    {
        this.context = context;
    }

//    @Override
//    public Single<List<UserResponse>> getAllRealmUser()
//    {
//        Realm.init(context);
//        Realm realm = Realm.getInstance(config);
//        List<UserResponse> responses = realm.copyFromRealm(realm
//                .where(UserResponse.class)
//                .findAllSorted(AppNames.USERNAME, Sort.ASCENDING));
//        realm.close();
//        Timber.d("getAllRealmUser");
//        return Single.just(responses);
//    }
//
//    @Override
//    public Completable saveRealmStaff(List<Doctor> response)
//    {
//        try
//        {
//            return Completable.fromAction(() ->
//            {
//                Realm.init(context);
//                Realm realm = Realm.getInstance(config);
//                realm.beginTransaction();
//                realm.insertOrUpdate(response);
//                realm.commitTransaction();
//                realm.close();
//                Timber.d("Сохранение списка докторов прошло успешно");
//                Realm.compactRealm(config);
//            });
//        } catch (Exception e)
//        {
//            Timber.e("Сохранение списка докторов произошло с ошибкой: " + e.getMessage());
//        }
//        return Completable.complete();
//    }
}

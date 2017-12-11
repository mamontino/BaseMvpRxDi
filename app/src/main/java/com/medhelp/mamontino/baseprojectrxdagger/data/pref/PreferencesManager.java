package com.medhelp.mamontino.baseprojectrxdagger.data.pref;

import android.content.Context;
import android.content.SharedPreferences;

import com.medhelp.mamontino.baseprojectrxdagger.di.scope.PerApplication;
import com.medhelp.mamontino.baseprojectrxdagger.utils.main.AppConstants;

import javax.inject.Inject;


@PerApplication
public class PreferencesManager implements PreferencesHelper
{
    private static final String PREF_KEY_CURRENT_USER_ID = "PREF_KEY_CURRENT_USER_ID";
    private static final String PREF_KEY_NOTIFICATIONS = "notifications";

    private final SharedPreferences preferences;

    @Inject
    public PreferencesManager(@PerApplication Context context)
    {
        String prefName = AppConstants.PREF_NAME;
        preferences = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
    }

    @Override
    public int getCurrentUserId()
    {
        return preferences.getInt(PREF_KEY_CURRENT_USER_ID, 0);
    }

    @Override
    public void setCurrentUserId(int userId)
    {
        preferences.edit().putInt(PREF_KEY_CURRENT_USER_ID, userId).apply();
    }


    @Override
    public void addNotification(String notification)
    {
        String oldNotifications = getNotifications();
        if (oldNotifications != null)
        {
            oldNotifications += "|" + notification;
        } else
        {
            oldNotifications = notification;
        }
        preferences.edit().putString(PREF_KEY_NOTIFICATIONS, oldNotifications).apply();
    }

    @Override
    public String getNotifications()
    {
        return preferences.getString(PREF_KEY_NOTIFICATIONS, null);
    }
}

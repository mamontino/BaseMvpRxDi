package com.medhelp.mamontino.baseprojectrxdagger.data.pref;

public interface PreferencesHelper {

    int getCurrentUserId();

    void setCurrentUserId(int userId);

    void addNotification(String notification);

    String getNotifications();
}

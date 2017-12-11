package com.medhelp.mamontino.baseprojectrxdagger.data;


import com.medhelp.mamontino.baseprojectrxdagger.data.db.RealmHelper;
import com.medhelp.mamontino.baseprojectrxdagger.data.network.NetworkHelper;
import com.medhelp.mamontino.baseprojectrxdagger.data.pref.PreferencesHelper;

public interface DataHelper extends PreferencesHelper, NetworkHelper, RealmHelper
{
    boolean checkNetwork();
}

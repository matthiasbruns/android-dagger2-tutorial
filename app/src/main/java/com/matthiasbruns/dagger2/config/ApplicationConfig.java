package com.matthiasbruns.dagger2.config;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;

/**
 * Created by Bruns on 20.07.2017.
 */
public class ApplicationConfig {

    private static final String PREF_NAME = "dagger2";

    private boolean mOnlineAllowed;

    private SharedPreferences mPreferences;

    @Inject
    public ApplicationConfig(final Context context) {
        mPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public boolean isOnlineAllowed() {
        return mOnlineAllowed;
    }

    public void setOnlineAllowed(final boolean onlineAllowed) {
        mOnlineAllowed = onlineAllowed;
    }
}

package com.matthiasbruns.dagger2.config;

/**
 * Stores runtime settings for this app.
 * You could also put the settings into the {@link android.content.SharedPreferences},
 * but we won't do this for this example.
 */
public class ApplicationConfig {

    /**
     * Flag is online features are allowed or not
     */
    private boolean mOnlineAllowed;

    public boolean isOnlineAllowed() {
        return mOnlineAllowed;
    }

    public void setOnlineAllowed(final boolean onlineAllowed) {
        mOnlineAllowed = onlineAllowed;
    }
}

package com.matthiasbruns.dagger2.injection;

import com.matthiasbruns.dagger2.config.ApplicationConfig;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * This module injects dependencies important for activities.
 */
@Module
public class ActivityModule {

    /**
     * The activity which belongs to this module
     */
    @NonNull
    private final Activity mActivity;

    public ActivityModule(@NonNull final Activity activity) {
        mActivity = activity;
    }

    /**
     * Provides the activity context
     */
    @Provides
    @ActivityScope
    Context provideContext() {
        return mActivity;
    }

    /**
     * Provides a title suffix for the app
     *
     * @param config required to decide which title to use
     */
    @Provides
    @Named("titleSuffix")
    @ActivityScope
    String provideTitleSuffix(@NonNull final ApplicationConfig config) {
        if (config.isOnlineAllowed()) {
            return " - Online";
        }
        return " - Offline";
    }
}
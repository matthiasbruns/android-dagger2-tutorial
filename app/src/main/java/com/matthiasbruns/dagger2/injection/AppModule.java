package com.matthiasbruns.dagger2.injection;

import com.matthiasbruns.dagger2.DaggerApplication;
import com.matthiasbruns.dagger2.config.ApplicationConfig;

import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * This module provides app-wide dependencies.
 */
@Module
public class AppModule {

    /**
     * The application this module belongs to
     */
    @NonNull
    private final DaggerApplication mApplication;

    public AppModule(@NonNull final DaggerApplication application) {
        mApplication = application;
    }

    /**
     * The application context of this app as a Singleton
     */
    @Provides
    @Singleton
    Context provideApplicationContext() {
        return mApplication;
    }

    /**
     * The application config of this app as a Singleton
     */
    @Provides
    @Singleton
    ApplicationConfig providesApplicationConfig() {
        return new ApplicationConfig(mApplication);
    }

    /**
     * The {@link DaggerApplication} of this app as a Singleton
     */
    @Provides
    @Singleton
    DaggerApplication providesDaggerApplication() {
        return mApplication;
    }
}

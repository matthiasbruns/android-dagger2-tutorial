package com.matthiasbruns.dagger2.injection;

import com.matthiasbruns.dagger2.DaggerApplication;
import com.matthiasbruns.dagger2.config.ApplicationConfig;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Bruns on 20.07.2017.
 */
@Module
public class AppModule {

    private final DaggerApplication mApplication;

    public AppModule(final DaggerApplication application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    ApplicationConfig providesApplicationConfig() {
        return new ApplicationConfig(mApplication);
    }

    @Provides
    @Singleton
    DaggerApplication providesDaggerApplication() {
        return mApplication;
    }
}

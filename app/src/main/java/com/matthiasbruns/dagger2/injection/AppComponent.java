package com.matthiasbruns.dagger2.injection;

import com.matthiasbruns.dagger2.DaggerApplication;
import com.matthiasbruns.dagger2.LemmingActivity;
import com.matthiasbruns.dagger2.config.ApplicationConfig;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Bruns on 20.07.2017.
 */
@Singleton
@Component(modules = {AppModule.class, LemmingModule.class})
public interface AppComponent {

    ApplicationConfig config();

    void inject(@NonNull final DaggerApplication application);

    void inject(@NonNull final LemmingActivity activity);
}

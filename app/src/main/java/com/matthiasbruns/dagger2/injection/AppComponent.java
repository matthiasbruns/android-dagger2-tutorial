package com.matthiasbruns.dagger2.injection;

import com.matthiasbruns.dagger2.DaggerApplication;
import com.matthiasbruns.dagger2.config.ApplicationConfig;
import com.matthiasbruns.dagger2.repository.LemmingRepository;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Bruns on 20.07.2017.
 */
@Singleton
@Component(modules = {AppModule.class, RepositoryModule.class})
public interface AppComponent {

    /**
     * Allows components which depend on this component to use the
     * {@link ApplicationConfig} managed in here.
     */
    ApplicationConfig config();

    /**
     * Injects dependencies into the {@link DaggerApplication} class
     */
    void inject(@NonNull final DaggerApplication application);

    /**
     * Allows components which depend on this component to use the
     * {@link LemmingRepository} managed in here.
     */
    LemmingRepository lemmingRepository();
}

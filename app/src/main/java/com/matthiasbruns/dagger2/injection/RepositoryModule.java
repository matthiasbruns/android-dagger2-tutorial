package com.matthiasbruns.dagger2.injection;

import com.matthiasbruns.dagger2.config.ApplicationConfig;
import com.matthiasbruns.dagger2.lemming.repository.LemmingRepository;
import com.matthiasbruns.dagger2.lemming.repository.impl.LemmingCacheRepository;
import com.matthiasbruns.dagger2.lemming.repository.impl.LemmingRestRepository;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * This module provides repositories for this app.
 */
@Module
public class RepositoryModule {

    /**
     * The {@link LemmingRepository} can have multiple implementations.
     * Based on the {@link ApplicationConfig} the returned implementation can differ.
     */
    @Provides
    @Singleton
    LemmingRepository provideLemmingRepository(@NonNull final ApplicationConfig config) {
        if (config.isOnlineAllowed()) {
            return new LemmingRestRepository();
        }
        return new LemmingCacheRepository();
    }
}

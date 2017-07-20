package com.matthiasbruns.dagger2.injection;

import com.matthiasbruns.dagger2.config.ApplicationConfig;
import com.matthiasbruns.dagger2.repository.LemmingRepository;
import com.matthiasbruns.dagger2.repository.impl.LemmingCacheRepository;
import com.matthiasbruns.dagger2.repository.impl.LemmingRestRepository;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Bruns on 20.07.2017.
 */
@Module
public class RepositoryModule {

    @Provides
    @Singleton
    LemmingRepository provideLemmingRepository(@NonNull final ApplicationConfig config) {
        if (config.isOnlineAllowed()) {
            return new LemmingRestRepository();
        }
        return new LemmingCacheRepository();
    }
}

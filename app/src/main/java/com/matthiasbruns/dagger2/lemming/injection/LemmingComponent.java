package com.matthiasbruns.dagger2.lemming.injection;

import com.matthiasbruns.dagger2.injection.ActivityModule;
import com.matthiasbruns.dagger2.injection.ActivityScope;
import com.matthiasbruns.dagger2.injection.AppComponent;
import com.matthiasbruns.dagger2.lemming.view.LemmingActivity;

import dagger.Component;

/**
 * A domain based components to provide required dependencies for the lemmings domain. Depends on
 * {@link AppComponent} to receive the {@link com.matthiasbruns.dagger2.config.ApplicationConfig} as
 * a Singleton
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface LemmingComponent {

    /**
     * Injects dependencies into the {@link LemmingActivity}
     */
    void inject(LemmingActivity activity);

}

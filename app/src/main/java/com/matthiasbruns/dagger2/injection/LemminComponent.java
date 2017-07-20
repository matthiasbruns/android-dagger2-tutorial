package com.matthiasbruns.dagger2.injection;

import com.matthiasbruns.dagger2.LemmingActivity;

import dagger.Component;

/**
 * Created by Bruns on 20.07.2017.
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface LemminComponent {

    void inject(LemmingActivity activity);

}

package com.matthiasbruns.dagger2.injection;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Bruns on 20.07.2017.
 */
@Module
public class ActivityModule {

    private final Activity mActivity;

    public ActivityModule(final Activity activity) {
        mActivity = activity;
    }

    @Provides
    Context provideContext() {
        return mActivity;
    }
}

package com.matthiasbruns.dagger2;

import com.matthiasbruns.dagger2.config.ApplicationConfig;
import com.matthiasbruns.dagger2.injection.AppComponent;
import com.matthiasbruns.dagger2.injection.AppModule;
import com.matthiasbruns.dagger2.injection.DaggerAppComponent;
import com.matthiasbruns.dagger2.injection.LemmingModule;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Inject;

/**
 * Created by Bruns on 20.07.2017.
 */
public class DaggerApplication extends Application {

    @NonNull
    @Inject
    protected ApplicationConfig mApplicationConfig;

    @NonNull
    private AppModule mAppModule;

    @NonNull
    private AppComponent mComponent;

    @NonNull
    public static DaggerApplication application(@NonNull final Context context) {
        return (DaggerApplication) context.getApplicationContext();
    }

    public AppComponent component() {
        return mComponent;
    }

    @NonNull
    public AppModule module() {
        return mAppModule;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mAppModule = new AppModule(this);
        mComponent = DaggerAppComponent.builder()
                .lemmingModule(new LemmingModule())
                .appModule(mAppModule)
                .build();

        mComponent.inject(this);

        // Will be used during component injection
        mApplicationConfig.setOnlineAllowed(BuildConfig.FLAVOR.contains("online"));
    }
}

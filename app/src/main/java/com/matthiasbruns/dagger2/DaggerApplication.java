package com.matthiasbruns.dagger2;

import com.matthiasbruns.dagger2.config.ApplicationConfig;
import com.matthiasbruns.dagger2.injection.AppComponent;
import com.matthiasbruns.dagger2.injection.AppModule;
import com.matthiasbruns.dagger2.injection.DaggerAppComponent;
import com.matthiasbruns.dagger2.injection.RepositoryModule;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Inject;

/**
 * Main entry point of this app.
 * Prepares dependency injection.
 */
public class DaggerApplication extends Application {

    /**
     * The ApplicationConfig is used to manage app-wide settings.
     */
    @NonNull
    @Inject
    protected ApplicationConfig mApplicationConfig;

    /**
     * The app-wide {@link AppComponent}.
     */
    @NonNull
    private AppComponent mComponent;

    /**
     * Helper to get the {@link DaggerApplication} from the application context.
     */
    @NonNull
    public static DaggerApplication application(@NonNull final Context context) {
        return (DaggerApplication) context.getApplicationContext();
    }

    /**
     * The dagger {@link AppComponent} which other components can use to depend on.
     */
    public AppComponent component() {
        return mComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize the dependency graph
        mComponent = DaggerAppComponent.builder()
                .repositoryModule(new RepositoryModule())
                .appModule(new AppModule(this))
                .build();

        // Inject dependencies (ApplicationConfig) into this class
        mComponent.inject(this);

        // Decide, if we can use online features or not
        mApplicationConfig.setOnlineAllowed(BuildConfig.FLAVOR.contains("online"));
    }
}

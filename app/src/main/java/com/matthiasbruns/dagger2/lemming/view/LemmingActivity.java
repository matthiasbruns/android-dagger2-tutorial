package com.matthiasbruns.dagger2.lemming.view;

import com.matthiasbruns.dagger2.DaggerApplication;
import com.matthiasbruns.dagger2.R;
import com.matthiasbruns.dagger2.injection.ActivityModule;
import com.matthiasbruns.dagger2.lemming.injection.DaggerLemmingComponent;
import com.matthiasbruns.dagger2.lemming.repository.LemmingRepository;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Example activity, which displays the class name of the injected {@link LemmingRepository}
 */
public class LemmingActivity extends AppCompatActivity {

    /**
     * Required to load lemming data.
     * Has to be injected.
     */
    @Inject
    protected LemmingRepository mLemmingRepository;

    /**
     * Indicator which displayed what version we use
     */
    @Inject
    @Named("titleSuffix")
    protected String mTitleSuffix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create the LemmingComponent and inject this activity
        DaggerLemmingComponent.builder()
                .appComponent(DaggerApplication.application(this).component())
                .activityModule(new ActivityModule(this))
                .build().inject(this);

        // Initialize the layout
        setContentView(R.layout.activity_main);

        // Set the content of the TextView to be the class name of the injected LemmingRepository
        ((TextView) findViewById(R.id.text)).setText(mLemmingRepository.getClass().getSimpleName());

        // Add the title suffix to the activity title
        setTitle(getTitle() + mTitleSuffix);
    }
}

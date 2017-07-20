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

public class LemmingActivity extends AppCompatActivity {

    @Inject
    protected LemmingRepository mLemmingRepository;

    @Inject
    @Named("titleSuffix")
    protected String mTitleSuffix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerLemmingComponent.builder()
                .appComponent(DaggerApplication.application(this).component())
                .activityModule(new ActivityModule(this))
                .build().inject(this);

        setContentView(R.layout.activity_main);

        ((TextView) findViewById(R.id.text)).setText(mLemmingRepository.getClass().getSimpleName());

        setTitle(getTitle() + mTitleSuffix);
    }
}

package com.matthiasbruns.dagger2;

import com.matthiasbruns.dagger2.injection.ActivityModule;
import com.matthiasbruns.dagger2.injection.DaggerLemminComponent;
import com.matthiasbruns.dagger2.repository.LemmingRepository;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;
import javax.inject.Named;

public class LemmingActivity extends AppCompatActivity {

    @Inject
    protected LemmingRepository mLemmingRepository;

    @Inject
    @Named("title")
    protected String mTitleSuffix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerLemminComponent.builder()
                .appComponent(DaggerApplication.application(this).component())
                .activityModule(new ActivityModule(this))
                .build().inject(this);

        setContentView(R.layout.activity_main);

        ((TextView) findViewById(R.id.text)).setText(mLemmingRepository.getClass().getSimpleName());

        setTitle(getTitle() + mTitleSuffix);
    }
}

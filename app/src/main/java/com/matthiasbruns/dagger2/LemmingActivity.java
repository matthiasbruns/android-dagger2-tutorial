package com.matthiasbruns.dagger2;

import com.matthiasbruns.dagger2.repository.LemmingRepository;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class LemmingActivity extends AppCompatActivity {

    @Inject
    protected LemmingRepository mLemmingRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerApplication.application(this).component().inject(this);

        setContentView(R.layout.activity_main);

        ((TextView) findViewById(R.id.text)).setText(mLemmingRepository.getClass().getSimpleName());
    }
}

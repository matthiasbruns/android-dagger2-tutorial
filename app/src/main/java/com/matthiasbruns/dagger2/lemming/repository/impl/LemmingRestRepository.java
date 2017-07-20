package com.matthiasbruns.dagger2.lemming.repository.impl;

import com.matthiasbruns.dagger2.lemming.data.Lemming;
import com.matthiasbruns.dagger2.lemming.repository.LemmingRepository;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bruns on 20.07.2017.
 */
public class LemmingRestRepository implements LemmingRepository {

    private static final Lemming LEMMING = new Lemming();

    @Override
    public List<Lemming> all() {
        return new ArrayList<>();
    }

    @Override
    public void delete(@NonNull final Integer integer) {
        // do something online
    }

    @Nullable
    @Override
    public Lemming get(@NonNull final Integer integer) {
        return LEMMING;
    }

    @Override
    public void insert(@NonNull final Lemming lemming) {
        // Send to the interwebs
    }

    @Override
    public void update(@NonNull final Lemming lemming) {
        // Send to the interwebs
    }

    static {
        LEMMING.setId(1);
        LEMMING.setName("FAKE");
        LEMMING.setAge(99);
        LEMMING.setSpeed(9000);
    }
}

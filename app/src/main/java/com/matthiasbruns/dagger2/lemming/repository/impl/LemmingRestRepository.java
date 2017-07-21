package com.matthiasbruns.dagger2.lemming.repository.impl;

import com.matthiasbruns.dagger2.lemming.data.Lemming;
import com.matthiasbruns.dagger2.lemming.repository.LemmingRepository;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * This lemming repository communicates with a rest service.
 */
public class LemmingRestRepository implements LemmingRepository {

    /**
     * Example object
     */
    private static final Lemming LEMMING = new Lemming();

    /**
     * Loads all lemmings from the rest service.
     */
    @Override
    public List<Lemming> all() {
        return new ArrayList<>();
    }

    /**
     * Deletes a lemming from the rest service.
     */
    @Override
    public void delete(@NonNull final Integer integer) {
        // do something online
    }

    /**
     * Returns a lemming by its id from the rest service.
     */
    @Nullable
    @Override
    public Lemming get(@NonNull final Integer integer) {
        return LEMMING;
    }

    /**
     * Adds a lemming to the rest service.
     */
    @Override
    public void insert(@NonNull final Lemming lemming) {
        // Send to the interwebs
    }

    /**
     * Updates a lemming by its id in the rest service
     */
    @Override
    public void update(@NonNull final Lemming lemming) {
        // Send to the interwebs
    }

    /**
     * Fills our fake lemming with data
     */
    static {
        LEMMING.setId(1);
        LEMMING.setName("FAKE");
        LEMMING.setAge(99);
        LEMMING.setSpeed(9000);
    }
}

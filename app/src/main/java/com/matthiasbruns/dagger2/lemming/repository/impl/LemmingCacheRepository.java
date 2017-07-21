package com.matthiasbruns.dagger2.lemming.repository.impl;

import com.matthiasbruns.dagger2.lemming.data.Lemming;
import com.matthiasbruns.dagger2.lemming.repository.LemmingRepository;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The LemmingCacheRepository uses stores lemmings in memory.
 */
public class LemmingCacheRepository implements LemmingRepository {

    /**
     * Our Cache.
     */
    @SuppressLint("UseSparseArrays")
    private Map<Integer, Lemming> mLemmingHashMap = new HashMap<>();

    /**
     * Gets all lemmings from the cache
     */
    @Override
    public List<Lemming> all() {
        return new ArrayList<>(mLemmingHashMap.values());
    }

    /**
     * Deletes a lemming by its id from the cache.
     */
    @Override
    public void delete(@NonNull final Integer integer) {
        mLemmingHashMap.remove(integer);
    }

    /**
     * Returns the lemming by its id.
     */
    @Override
    @Nullable
    public Lemming get(@NonNull final Integer integer) {
        return mLemmingHashMap.get(integer);
    }

    /**
     * Adds a new lemming into the cache
     */
    @Override
    public void insert(@NonNull final Lemming lemming) {
        mLemmingHashMap.put(lemming.getId(), lemming);
    }

    /**
     * Updates a cached lemming by its id
     */
    @Override
    public void update(@NonNull final Lemming lemming) {
        // Cheap - I know - is enough for this example
        mLemmingHashMap.put(lemming.getId(), lemming);
    }
}

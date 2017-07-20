package com.matthiasbruns.dagger2.repository.impl;

import com.matthiasbruns.dagger2.data.Lemming;
import com.matthiasbruns.dagger2.repository.LemmingRepository;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Singleton;

/**
 * Created by Bruns on 20.07.2017.
 */
@Singleton
public class LemmingCacheRepository implements LemmingRepository {

    @SuppressLint("UseSparseArrays")
    private Map<Integer, Lemming> mLemmingHashMap = new HashMap<>();

    @Override
    public List<Lemming> all() {
        return new ArrayList<>(mLemmingHashMap.values());
    }

    @Override
    public void delete(@NonNull final Integer integer) {
        mLemmingHashMap.remove(integer);
    }

    @Override
    @Nullable
    public Lemming get(@NonNull final Integer integer) {
        return mLemmingHashMap.get(integer);
    }

    @Override
    public void insert(@NonNull final Lemming lemming) {
        mLemmingHashMap.put(lemming.getId(), lemming);
    }

    @Override
    public void update(@NonNull final Lemming lemming) {
        // Cheap - I know - is enough for this example
        mLemmingHashMap.put(lemming.getId(), lemming);
    }
}

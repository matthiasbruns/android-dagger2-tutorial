package com.matthiasbruns.dagger2.repository;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.List;

/**
 * Created by Bruns on 20.07.2017.
 */
public interface Repository<T, ID> {

    List<T> all();

    void delete(@NonNull final ID id);

    @Nullable
    T get(@NonNull final ID id);

    void insert(@NonNull final T t);

    void update(@NonNull final T t);

}

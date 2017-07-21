package com.matthiasbruns.dagger2.repository;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.List;

/**
 * Simple interface to provide the implementation of the repository pattern.
 * THIS IS A SIMPLIFIED VERSION OF A REPOSITORY!
 * EVERYTHING WILL EXECUTE SYNCHRONOUSLY!
 */
public interface Repository<T, ID> {

    /**
     * Loads all objects of T
     */
    List<T> all();

    /**
     * Delets T by id if present
     */
    void delete(@NonNull final ID id);

    /**
     * Loads an object of T by its id if present
     */
    @Nullable
    T get(@NonNull final ID id);

    /**
     * Stores T in the datasource
     */
    void insert(@NonNull final T t);

    /**
     * Updates T by its id in the datasource
     */
    void update(@NonNull final T t);
}

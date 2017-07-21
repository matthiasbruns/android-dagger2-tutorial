package com.matthiasbruns.dagger2.lemming.repository;

import com.matthiasbruns.dagger2.lemming.data.Lemming;
import com.matthiasbruns.dagger2.repository.Repository;

/**
 * The base interface which can be implemented to provide access to lemming data.
 */
public interface LemmingRepository extends Repository<Lemming, Integer> {
}

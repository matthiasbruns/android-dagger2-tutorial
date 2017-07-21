package com.matthiasbruns.dagger2.lemming.data;

/**
 * Simple pojo which stores some lemming data
 */
public class Lemming {

    /**
     * Age of the lemming in years
     */
    private int mAge;

    /**
     * Id of the lemming provided by the data store
     */
    private int mId;

    /**
     * Yes - lemmings have names
     */
    private String mName;

    /**
     * How fast can you go?
     */
    private int mSpeed;

    /**
     * Age of the lemming in years
     */
    public int getAge() {
        return mAge;
    }

    /**
     * Id of the lemming provided by the data store
     */
    public int getId() {
        return mId;
    }

    /**
     * Yes - lemmings have names
     */
    public String getName() {
        return mName;
    }

    /**
     * Age of the lemming in years
     */
    public int getSpeed() {
        return mSpeed;
    }

    /**
     * Age of the lemming in years
     */
    public void setAge(final int age) {
        mAge = age;
    }

    /**
     * Id of the lemming provided by the data store
     */
    public void setId(final int id) {
        mId = id;
    }

    /**
     * Yes - lemmings have names
     */
    public void setName(final String name) {
        mName = name;
    }

    /**
     * Age of the lemming in years
     */
    public void setSpeed(final int speed) {
        mSpeed = speed;
    }
}

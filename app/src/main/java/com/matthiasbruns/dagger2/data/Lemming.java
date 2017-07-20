package com.matthiasbruns.dagger2.data;

/**
 * Created by Bruns on 20.07.2017.
 */

public class Lemming {

    private int mAge;

    private int mId;

    private String mName;

    private int mSpeed;

    public int getAge() {
        return mAge;
    }

    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public int getSpeed() {
        return mSpeed;
    }

    public void setAge(final int age) {
        mAge = age;
    }

    public void setId(final int id) {
        mId = id;
    }

    public void setName(final String name) {
        mName = name;
    }

    public void setSpeed(final int speed) {
        mSpeed = speed;
    }
}

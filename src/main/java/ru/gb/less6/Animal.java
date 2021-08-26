package ru.gb.less6;

public abstract class Animal {

    private String name;
    private float valueR;
    private float valueS;
    private final float MAX_LENGTH_RUN = 0;
    private final float MAX_LENGTH_SWIM= 0;

    abstract void run(float valueR);
    abstract void swim(float valueS);

}


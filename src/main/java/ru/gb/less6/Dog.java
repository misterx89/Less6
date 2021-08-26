package ru.gb.less6;

public class Dog extends Animal{
    private String name;
    private float valueR;
    private float valueS;
    private final float MAX_LENGTH_RUN = 500f;
    private final float MAX_LENGTH_SWIM = 10;

    public Dog(String name, float valueR, float valueS) {
        this.name = name;
        this.valueR = valueR;
        this.valueS = valueS;
    }

    @Override
    void run(float length) {
        if ((length >= 0) && (length <= MAX_LENGTH_RUN)) {
            System.out.println(name + " пробежал " + length + "м");
        } else {
            System.out.println(name + " не смог пробежать " + length + "м, так как ограничение по бегу " + MAX_LENGTH_RUN);
        }
    }

    @Override
    void swim(float length) {
        if ((length >= 0) && (length <= MAX_LENGTH_SWIM)) {
            System.out.println(name + " проплыл " + length + "м");
        } else {
            System.out.println(name + " не смог пробежать " + length + "м, так как ограничение по плаванию " + MAX_LENGTH_SWIM);
        }
    }
}

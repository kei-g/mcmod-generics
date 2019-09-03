package com.snowstep115.generics;

public class Test<T> {
    interface Factory<T> {
        T create(int id, String name);
    }

    private final Factory<T> factory;

    private Test(Factory<T> factory) {
        this.factory = factory;
    }

    @Override
    public String toString() {
        return this.factory.create(114514, "Test<T>").toString();
    }
}

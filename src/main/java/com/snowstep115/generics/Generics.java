package com.snowstep115.generics;

import java.lang.reflect.Constructor;
import java.util.HashMap;

import com.snowstep115.generics.Test.Factory;

public final class Generics {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        try {
            Class<Factory<String>> cls = (Class<Factory<String>>) Class.forName("com.snowstep115.generics.Test$Factory");
            Constructor<Test> ctor = Test.class.getDeclaredConstructor(cls);
            ctor.setAccessible(true);
            Factory<String> f = (id, name) -> "test";
            Test<String> test = ctor.newInstance(f);
            System.out.println(String.format("%s", test));
            HashMap<Integer, String> map = new HashMap<>();
            map.put(114514, "551");
            String name = map.compute(114514, (i, $) -> null);
            System.out.println(name);
        } catch (Throwable exception) {
            exception.printStackTrace();
        }
    }
}

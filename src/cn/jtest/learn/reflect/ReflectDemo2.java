package cn.jtest.learn.reflect;

import cn.jtest.learn.domain.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception{
        // 0. get Calculator  class object
        Class personClass = Person.class;

        // 1. get the Constructor[] -> get all PUBLIC constructor
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);

        // construct a instance
        Object person = constructor.newInstance("david", 16);
        System.out.println(person);

        // 1. get the Constructor[] -> get all PUBLIC constructor
        Constructor constructor2 = personClass.getConstructor();
        System.out.println(constructor2);

        // construct a instance
        Object person2 = constructor2.newInstance();
        System.out.println(person2);

        Object o = personClass.newInstance();
    }
}

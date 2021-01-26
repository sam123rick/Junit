package cn.jtest.learn.reflect;

import cn.jtest.learn.Domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception{
        // 0. get Calculator  class object
        Class personClass = Person.class;

        Method eatMethod = personClass.getMethod("eat");
        Person p = new Person();
        eatMethod.invoke(p);

        Method eatMethod2 = personClass.getMethod("eat", String.class);
        eatMethod2.invoke(p, "fish");

        System.out.println("---------");

        Method[] methods = personClass.getMethods();
        for (Method method: methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
        }

        // get Full Class name
        String className = personClass.getName();
    }
}

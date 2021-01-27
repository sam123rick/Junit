package cn.jtest.learn.reflect;

import cn.jtest.learn.domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo {
    public static void main(String[] args) throws Exception{
        // 0. get Calculator  class object
        Class personClass = Person.class;

        // 1. get the Field[] -> get all PUBLIC variable field
        Field[] fields = personClass.getFields();
        for (Field field: fields) {
            System.out.println(field);
        }

        System.out.println("...........");

        Field a = personClass.getField("name");
        // get field a value
        Person p = new Person("dave", 15);
        Object value = a.get(p);
        System.out.println(value);

        // set field value
        a.set(p, "dome");
        System.out.println(p);

        System.out.println("...........");

        //Field[] getDeclaredFields():  get all member variable regardless of the privite or protect
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        //Field getDeclaredField(String name);
        Field privateA = personClass.getDeclaredField("a");
        //ignore access modifier
        privateA.setAccessible(true);
        Object val2 = privateA.get(p);
        System.out.println(val2);

    }
}

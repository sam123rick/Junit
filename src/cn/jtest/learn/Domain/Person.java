package cn.jtest.learn.Domain;

public class Person {
    public String name;
    public int age;
    private String a;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat() {
        System.out.println("eat");
    }

    public void eat(String food) {
        System.out.println("eat " + food);
    }

    private void drink() {

    }
}

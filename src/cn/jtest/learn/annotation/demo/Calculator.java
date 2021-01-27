package cn.jtest.learn.annotation.demo;

public class Calculator {

    @Check
    public void add() {
        System.out.println(" 1 + 0 = " + (1 + 0));
    }

    @Check
    public void minus() {
        System.out.println(" 1 - 0 = " + (1 - 0));
    }

    @Check
    public void mul() {
        System.out.println(" 1 * 0 = " + (1 * 0));
    }

    @Check
    public void div() {
        System.out.println(" 1 / 0 = " + (1 / 0));
    }

    public void show() {
        System.out.println("String print");
    }

    public Calculator() {
    }
}

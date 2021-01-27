package cn.jtest.learn.annotation;

public @interface MyAnno {
    String name() default "Chen";
    int age();
    MyAnno2 anno2() default @MyAnno2;
}

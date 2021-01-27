package cn.jtest.learn.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD}) // shows this annotation can only be used on Class
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnno3 {
}

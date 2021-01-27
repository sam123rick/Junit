package cn.jtest.learn.annotation;

/**
 * Annotation demo
 * @author zyy
 * @version 1.0
 * @since 1.5
 */

public class AnnoDemo1 {


   /**
    * Calculate sum of two number
    * @param a int
    * @param b int
    * @return int
    */
    public int add (int a, int b) {
        return a + b;
    }

    @MyAnno(name = "dave", age = 12)
    public void minus() {
    }

    @MyAnno(age = 12, anno2 = @MyAnno2)
    public void divide() {
    }

}

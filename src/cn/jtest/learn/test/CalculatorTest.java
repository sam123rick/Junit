package cn.jtest.learn.test;

import cn.jtest.learn.junit.Calculator;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    /**
     * init method();
     * Used to allocate resource. All test methods should execute this before excecution
     */
    @BeforeEach
    public void init() {
        System.out.println("in init");
    }

    /**
     * close method();
     * Used to release the resource after testing
     */
    @AfterEach
    public void close() {
        System.out.println("in close");
    }

    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        int result = c.add(1, 2);
        System.out.println("in add");
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testMinus() {
        Calculator c = new Calculator();
        int result = c.minus(1, 2);
        System.out.println("in minus");
        Assertions.assertEquals(-1, result);
    }
}

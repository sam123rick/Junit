package cn.jtest.learn.annotation.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class TestCheck {

    public static void main(String[] args) throws IOException {
        Calculator c = new Calculator();

        // get the Calculator class object
        Class cls = c.getClass();

        // get all the methods in the class object
        Method[] methods = cls.getMethods();

        // check if there is Check annotation on the method
        // if there is then execute

        int num = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method: methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    // Catch the exception
                    // Write to file
                    num ++;

                    bw.write(method.getName() + " method throws an exception");
                    bw.newLine();
                    bw.write("Exception name is: " + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("Exception is caused by: " + e.getCause().getMessage());
                    bw.newLine();
                }
            }
        }
        bw.write("Total " + num + " times exception");
        bw.flush();
        bw.close();
    }
}

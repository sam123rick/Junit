package cn.jtest.learn.annotation;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

@Pro(className = "cn.jtest.learn.annotation.Demo1", methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception{
        // Can construct any Object and can execute any method

        /*
        Precondition: Can't change any code in this class. Can construct any class object. Can execute any mehtod
         */

        // Get the annotated class
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        // Get the annotation object above
        // This line generates a child Class which implements this annotation Pro in memory
        Pro annotation = reflectTestClass.getAnnotation(Pro.class);
        //  get the return method of this className
        String className = annotation.className();
        String methodName = annotation.methodName();

        System.out.println(className);
        System.out.println(methodName);

        // 3. Load the Class to memory
        Class cls = Class.forName(className);


        // 4. COnstruct an object for this class
        Object obj = cls.newInstance();

        // 5. Get method name
        Method method = cls.getMethod(methodName);

        // 6. Execute method
        method.invoke(obj);
    }
}

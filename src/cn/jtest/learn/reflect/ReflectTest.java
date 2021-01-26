package cn.jtest.learn.reflect;

import cn.jtest.learn.Domain.Person;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception{
        // Can construct any Object and can execute any method

        /*
        Precondition: Can't change any code in this class. Can construct any class object. Can execute any mehtod
         */
        // 1. load properties file
        Properties pro = new Properties();
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        // 2. Load data in the properties file
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

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

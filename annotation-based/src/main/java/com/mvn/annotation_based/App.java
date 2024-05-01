package com.mvn.annotation_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
    	Car c=(Car) context.getBean("two",Car.class);
    	c.carstarted();
    }
}

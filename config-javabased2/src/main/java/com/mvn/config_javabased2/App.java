package com.mvn.config_javabased2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(javaconfig.class);
    	employee e=(employee) context.getBean("id1");
    	
    	e.display();
    }
}

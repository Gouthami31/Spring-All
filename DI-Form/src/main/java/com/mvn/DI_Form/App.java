package com.mvn.DI_Form;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
    	StudentBean sb=(StudentBean) context.getBean("student");
    	sb.print();
    }
}

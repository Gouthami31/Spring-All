package com.mvn.collection_set;


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
        ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
        ATBean atb=(ATBean)context.getBean("institute");
        atb.print();
    }
}

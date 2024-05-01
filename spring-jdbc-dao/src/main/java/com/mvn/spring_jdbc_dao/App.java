package com.mvn.spring_jdbc_dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
        ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
        BeanClass bc=(BeanClass)context.getBean("jdbcId3");
        bc.create();
    }
}

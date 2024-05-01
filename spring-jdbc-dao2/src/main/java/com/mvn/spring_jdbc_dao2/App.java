package com.mvn.spring_jdbc_dao2;
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
    	@SuppressWarnings("resourse")
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        employeebean b = (employeebean) context.getBean("empBean"); 
        b.createTable();
    }
}
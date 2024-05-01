package com.mvn.second;

import com.mvn.second.interfacee.employeeimple;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*employee e=new employee("gouthu",101,10000);
    	
        System.out.println( e.getName() );
        System.out.println( e.getAge() );
        System.out.println( e.getSalary() );
        e.setName("Gouthami");
        System.out.println( e.getName() );*/
        
        employeeimple e=new employeeimple("aaa",21,20000);
        System.out.println(e.getName());
        System.out.println(e.getAge());
        e.setName("reddy");
        System.out.println(e.getName());
        
        
        
        
        
    }
}

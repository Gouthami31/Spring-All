package com.mvn.employee;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	/*employeeClassMethods e=new employeeClassMethods();
    	e.insert(101,"aaa");
    	e.print();
    	
        System.out.println( "Hello World!" );*/
    	
    	/*employeeConstructor es=new employeeConstructor(101,"aaa");
    	es.print();*/
    	
    	employeeSetter es=new employeeSetter();
    	es.setid(102);
    	System.out.println(es.getid());
    	es.setname("bbb");
    	System.out.println(es.getname());
    		
    	
    }
}

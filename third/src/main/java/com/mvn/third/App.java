package com.mvn.third;

import com.mvn.third.interfacee.studentimple;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*student s=new student(101,"gouthami","java");
    	System.out.println(s.getRollnum());
    	System.out.println(s.getName());
    	System.out.println(s.getCourse());
    	s.setRollnum(102);
    	s.setName("reddy");
    	s.setCourse("python");
    	System.out.println(s.getRollnum());
    	System.out.println(s.getName());
    	System.out.println(s.getCourse());*/
    	
    	
    	studentimple s1=new studentimple(1,"hello","java");
    	System.out.println(s1.getRollnum());
    	System.out.println(s1.getName());
    	System.out.println(s1.getCourse());
    	s1.setRollnum(2);
    	s1.setName("reddy");
    	s1.setCourse("python");
    	System.out.println(s1.getRollnum());
    	System.out.println(s1.getName());
    	System.out.println(s1.getCourse());
    	
    }
}

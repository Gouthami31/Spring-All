package com.mvn.Has_A_Relation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        marks m=new marks(95,96,97);
        student s=new student("gouthami",8,m);
        s.Display();
        school sh=new school("siddartha",s);
        sh.print();
        
        
    }
}

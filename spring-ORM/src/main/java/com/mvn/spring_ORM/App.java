package com.mvn.spring_ORM;


import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvn.spring_ORM.dao.studentdao;

public class App {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        studentdao sd = (studentdao) context.getBean("stDao"); // Corrected syntax for getting bean
        System.out.println(sd.toString()); // Corrected method invocation syntax

     // savestudent
        
         studentBean std=new studentBean(); 
//         std.setId(1);
//          std.setName("gouthami");
//          std.setCourse("java"); 
//            std.setId(2);
//            std.setName("hello");
//            std.setCourse("python"); 
//            sd.savestudent(std);
         

     // viewstudent
          
        /*  studentBean i = sd.viewstudentOne(2);
        System.out.println(i);*/
         
        
     //Update
          /*if(std!=null) {
        	  std.setId(2);
        	  std.setName("reddy");
        	  std.setCourse(".net");
        	  System.out.println("updated succesfully");
          }
          else {
        	  
             System.out.println("failed to update");
          }*/
          
    // deletestudent
        
        /* if(std!=null) {
        	 int i=1;
        	 std.deletestudent(i);
        	 System.out.println("deleted successfully");
         }
         else {
        	 System.out.println("failed to delete");
         }*/

     //loadall
        /* List<studentBean> allStudents = sd.studentAll();

         // Check if there are any students
         if (!allStudents.isEmpty()) {
             System.out.println("List of all students:");
             for (studentBean student : allStudents) {
                 System.out.println(student); // Assuming studentBean has overridden toString() method
             }
         } else {
             System.out.println("No students found.");
         } */

    }
}

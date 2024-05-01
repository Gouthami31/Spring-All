package com.mvn.third;

public class student {
      int rollnum;
      String name;
      String course;
      public student(int rollnum,String name,String course) {
    	  this.rollnum=rollnum;
    	  this.name=name;
    	  this.course=course;
    	 
      }
      public void setRollnum(int rollnum) {
    	  this.rollnum =rollnum;
    	  
      }
      public void setName(String name) {
    	  this.name=name;
      }
      public void setCourse(String course) {
    	  this.course=course;
      }
      public int getRollnum() {
    	  return this.rollnum;
      }
      public String getName() {
    	  return this.name;
      }
      public String getCourse() {
    	  return this.course;
      }
      
}

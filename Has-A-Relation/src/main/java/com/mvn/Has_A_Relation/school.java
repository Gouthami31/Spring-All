package com.mvn.Has_A_Relation;

public class school {
      private String sclname;
      private student stu;
      public school(String sclname,student stu) {
    	  this.sclname=sclname;
    	  this.stu=stu;
      }
      public school() {
    	  
      }
      void print() {
    	  System.out.println(this.sclname);
    	  System.out.println(this.stu.getM());
      }
      public void setStu(student stu) {
    	  this.stu=stu;
      }
      public student getStu() {
    	  return this.stu;
      }
      
}

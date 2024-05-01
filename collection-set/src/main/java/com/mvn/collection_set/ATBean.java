package com.mvn.collection_set;

import java.util.Set;

public class ATBean {
      private Set<Integer> studentRollnumbers;
      public ATBean(Set<Integer> studentRollnumbers) {
    	  super();
    	  this.studentRollnumbers=studentRollnumbers;
      }
      public ATBean() {
    	 super(); 
      }
      public void setStudentRollnumbers(Set<Integer> studentRollnumbers) {
    	  this.studentRollnumbers=studentRollnumbers;
      }
      public Set<Integer> getStudentRollnumbers(){
    	  return this.studentRollnumbers;
      }
      public void print() {
    	  System.out.println(studentRollnumbers);
      }
      
}

package com.mvn.collection_list;

import java.util.List;

public class ATBean {
     private List<String> studentnames;
     //constructor
     public ATBean(List<String> studentnames) {
    	 this.studentnames=studentnames;
     }
     //default constructor
     public ATBean() {
    	 
     }
     //setters and getters
     public void setStudentnames(List<String> studentnames) {
    	 this.studentnames=studentnames;
     }
     public List<String>  getStudentnames(){
    	 return this.studentnames;
     }
     public void print() {
    	 for(String stu:studentnames) {
    		 System.out.println(stu);
    	 }
     }
}

package com.mvn.collection_property;

import java.util.Properties;
import java.util.Set;

public class ATBean {
     private Properties studentbatches;
     public ATBean(Properties studentbatches) {
    	 this.studentbatches=studentbatches;
     }
     public ATBean() {
    	 
     }
	public Properties getStudentbatches() {
		return studentbatches;
	}
	public void setStudentbatches(Properties studentbatches) {
		this.studentbatches = studentbatches;
	}
     public void print() {
    	 Set<String> keys = studentbatches.stringPropertyNames();
         for (String key : keys) {
             System.out.println(key + ": " + studentbatches.getProperty(key));
    	 }
     }
     
     
}

package com.mvn.autowiring;

public class SecondBean {
      private int id;
      private String name;
      public SecondBean(int id,String name) {
    	  this.id=id;
    	  this.name=name;
      }
      public SecondBean() {
    	  
      }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("this is setter");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}

package com.mvn.config_javabased;

public class BeanClass {
     private String name;
     private int id;
     public BeanClass(String name, int id) {
    	 this.name=name;
    	this.id =id;
     }
     public BeanClass() {
    	 
     }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
     public void display() {
    	 System.out.println(name);
    	 System.out.println(id);
     }
}

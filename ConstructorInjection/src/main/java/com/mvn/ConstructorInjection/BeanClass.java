package com.mvn.ConstructorInjection;

public class BeanClass {
    private int id;
    private String name;
    private String course;
    private int batch;
    private String location;
    public BeanClass(int id,String name,String course,int batch,String location) {
    	this.id=id;
    	this.name=name;
    	this.course=course;
    	this.batch=batch;
    	this.location=location;
    }
    public BeanClass() {
    	
    }
    public void Details() {
    	System.out.println(this.id);
    	System.out.println(this.name);
    	System.out.println(this.course);
    	System.out.println(this.batch);
    	System.out.println(this.location);
    }
    public void setId(int id) {
    	this.id=id;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public void setCourse(String course) {
    	this.course=course;
    }
    public void setBatch(int batch) {
    	this.batch=batch;
    }
    public void setLocation(String location) {
    	this.location=location;
    }
    public int getId() {
    	return this.id;
    }
    public String getName() {
    	return this.name;
    }
    public String getCourse() {
    	return this.course;
    }
    public int getBatch() {
    	return this.batch;
    }
    public String getLocation() {
    	return this.location;
    }
}

package com.mvn.employee;

public class employeeConstructor {
    int empid;
    String empname;
    public employeeConstructor(int id,String name) {
    	this.empid=id;
    	this.empname=name;
    }
    public void print(){
    	System.out.println(empid);
    	System.out.println(empname);
    }
    
}

package com.mvn.autowiring;

public class FirstBean {
     private SecondBean secondbean;
     public FirstBean (SecondBean secondbean) {
    	 this.secondbean=secondbean;
     }
     public FirstBean() {
    	 
     }
	public SecondBean getSecondbean() {
		return secondbean;
	}
	public void setSecondbean(SecondBean secondbean) {
		this.secondbean = secondbean;
	}
	public void print() {
		System.out.println("this is constructor");
		System.out.println(this.secondbean.getId());
		System.out.println(this.secondbean.getName());
    	
    }
}

package com.mvn.Application2;

public class BeanClass {                       //pojo class
	      private int num1;
	      private int num2; 
	                                             // parameteraized constructor
	      public BeanClass(int num1,int num2) {
	    	  this.num1=num1;
	    	  this.num2=num2;
	      }
	                                           //default constructor
	      public BeanClass() {
	    	  
	      }
	      public void printMul() {                 // print method
	    	  System.out.println(num1*num2);
	      }
	                                              //setters and getters
	      public void setNum1(int num1) {
	    	  this.num1=num1;
	      }
	      public void setNum2(int num2) {
	    	  this.num2=num2;
	      }
	      public int getNum1() {
	    	  return this.num1;
	      }
	      public int getNum2() {
	    	  return this.num2;
	      }
}

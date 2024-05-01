package com.mvn.depInjection;

public class product {
     private int pid;
     private String pname;
     private double price;
     public product(int pid,String pname,double price) {
    	 this.pid=pid;
    	 this.pname=pname;
    	 this.price=price;
     }
     public product() {
    	 
     }
     public void setPid(int pid) {
    	 this.pid=pid;
     }
     public void setPname(String pname) {
    	 this.pname=pname;
     }
     public void setPrice(double price) {
    	 this.price=price;
     }
     public int getPid() {
    	 return this.pid;
     }
     public String getPname() {
    	 return this.pname;
     }
     public double getPrice() {
    	 return this.price;
     }
}

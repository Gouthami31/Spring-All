package com.mvn.depInjection;

public class order {
	private int oid;
    private String oname;
    private product pro;
    public order(int oid,String oname,product pro) {
    	this.oid=oid;
    	this.oname=oname;
    	this.pro=pro;
    }
    public order() {
    	
    }
    void print() {
    	System.out.println(this.oid);
    	System.out.println(this.oname);
    	System.out.println(this.pro.getPid());
    	System.out.println(this.pro.getPname());
    	System.out.println(this.pro.getPrice());
    }
    
    
    public void setProduct(product pro) {
    	this.pro=pro;
    }
    public product getProduct() {
    	return this.pro;
    }
}

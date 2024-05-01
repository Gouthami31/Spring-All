package com.mvn.config_javabased2;

public class employee {
     private int id;
     private String name;
     private address adrs;
     public employee(int id,String name,address adrs) {
    	 this.id=id;
    	 this.name=name;
    	 this.adrs=adrs;
     }
    public employee() {
    	 
     }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public address getAdrs() {
		return adrs;
	}
	public void setAdrs(address adrs) {
		this.adrs = adrs;
	}
    public void display() {
    	System.out.println(id);
    	System.out.println(name);
    	System.out.println(adrs.getCity());
    	System.out.println(adrs.getState());
    	System.out.println(adrs.getPin());
    }
}

package com.mvn.DI_Form;

public class StudentBean {
    private int sid;
    private String sname;
    private AddressBean ab;
    public StudentBean(int sid,String sname,AddressBean ab) {
    	super();
    	this.sid=sid;
    	this.sname=sname;
    	this.ab=ab;
    }
    public StudentBean() {
    	super();
    }
    public void setSID(int sid) {
    	this.sid=sid;
    }
    public int getSID() {
    	return this.sid;
    }
    public void setSNAME(String sname) {
    	this.sname=sname;
    }
    public String getSNAME() {
    	return this.sname;
    }
    public void setAB(AddressBean ab) {
    	this.ab=ab;
    }
    public AddressBean getAB() {
    	return this.ab;
    }
    
    public void print() {
    	 System.out.println(this.sid);
    	 System.out.println(this.sname);
    	 System.out.println(this.ab.getHouseNum());
    	 System.out.println(this.ab.getCity());
    	 System.out.println(this.ab.getState());
    	 System.out.println(this.ab.getPincode());
    	 
    }
    
    
    
}

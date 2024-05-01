package com.mvn.Has_A_Relation;

public class student {
     private String sname;
     private int sclass;
     private marks m;
     public student(String sname,int sclass,marks m) {
    	 this.sname=sname;
    	 this.sclass=sclass;
    	 this.m=m;
     }
     public student() {
    	 
     }
     void Display() {
    	 System.out.println(this.sname);
    	 System.out.println(this.sclass);
    	 System.out.println(this.m.getTel());
    	 System.out.println(this.m.getHin());
    	 System.out.println(this.m.getEng());
     }
     public void setM(marks m) {
    	 this.m=m;
     }
     public marks getM() {
    	 return this.m;
     }
}

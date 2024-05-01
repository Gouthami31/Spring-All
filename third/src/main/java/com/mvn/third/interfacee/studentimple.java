package com.mvn.third.interfacee;

public class studentimple implements studentInterface {
	int rollnum;
	String name;
	String course;
	public studentimple(int rollnum,String name,String course) {
		this.rollnum=rollnum;
		this.name=name;
		this.course=course;
	}

	@Override
	public void setRollnum(int rollnum) {
		// TODO Auto-generated method stub
         this.rollnum=rollnum;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
          this.name=name;
	}

	@Override
	public void setCourse(String course) {
		// TODO Auto-generated method stub
           this.course=course;
	}

	@Override
	public int getRollnum() {
		// TODO Auto-generated method stub
		return this.rollnum;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getCourse() {
		// TODO Auto-generated method stub
		return this.course;
	}

}

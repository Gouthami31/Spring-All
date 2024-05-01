package com.mvn.second.interfacee;

public class employeeimple implements employeeInterface {
	String name;
	int age;
	double salary;
	public employeeimple(String name, int age,double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;

	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age=age;

	}

	@Override
	public void setSalary(double salary) {
		// TODO Auto-generated method stub
          this.salary=salary;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}

}

package com.mvn.DI_Form_of_objects;

public class ProductBean {
	private int proid;
	private String pname;
	private int price;

	public ProductBean(int proid, String pname, int price) {
		super();
		this.proid = proid;
		this.pname = pname;
		this.price = price;
	}

	public ProductBean() {
	}

	public void setId(int proid) {
		this.proid = proid;
	}

	public void setName(String pname) {
		this.pname = pname;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getId() {
		return this.proid;
	}

	public String getName() {
		return this.pname;
	}

	public int getPrice() {
		return this.price;
	}

}

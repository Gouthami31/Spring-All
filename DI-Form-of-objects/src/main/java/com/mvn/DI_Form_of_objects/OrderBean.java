package com.mvn.DI_Form_of_objects;

public class OrderBean {
	private int oid;
	private ProductBean pro;

	public OrderBean(int oid, ProductBean pro) {
		super();
		this.oid = oid;
		this.pro = pro;
	}

	public OrderBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public ProductBean getPro() {
		return pro;
	}

	public void setPro(ProductBean pro) {
		this.pro = pro;
	}

	public void print() {
		System.out.println(this.oid);
		System.out.println(this.pro.getId());
		System.out.println(this.pro.getName());
		System.out.println(this.pro.getPrice());
	}

}

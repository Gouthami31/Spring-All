package com.mvn.spring_jdbc_dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BeanClass {
	private JdbcTemplate jt;
   public BeanClass(JdbcTemplate jt) {
	   this.jt=jt;
   }
   public BeanClass() {
	   
   }
  public JdbcTemplate getJt() {
	return jt;
 }
  public void setJt(JdbcTemplate jt) {
	this.jt = jt;
  }
  public void create() {
	  jt.execute("create table person(id number,name varchar(20),course varchar(15))");
	  System.out.println("table created");
  }
   
}

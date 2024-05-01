package com.mvn.config_javabased2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaconfig {
	
	@Bean("id1")
	public employee getBean() {
		address ad=new address("ameerpet","telangana",500345);
    	employee em = new employee();
    	em.setId(101);
    	em.setName("gouthami");
        em.getAdrs();
        em.setAdrs(ad);
    	return em;
    	
    }
	
	
	
	
}
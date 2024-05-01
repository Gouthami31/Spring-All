package com.mvn.config_javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean("id1")
	public BeanClass getBean1() {
    	BeanClass bean = new BeanClass();
    	bean.setId(1);
    	bean.setName("Gouthami");
    	return bean;
    }
	
	@Bean("id2")
	public BeanClass getBean2() {
    	BeanClass bean = new BeanClass();
    	bean.setId(2);
    	bean.setName("tharuna");
    	return bean;
    }
}

package com.mvn.Application1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class App 
{
    public static void main( String[] args )
    {
       ClassPathResource res=new ClassPathResource("SpringConfig.xml");
       XmlBeanFactory fc=new XmlBeanFactory(res);
       BeanClass mybean=(BeanClass) fc.getBean("add");
       mybean.print();
       
       
    }
}

package com.mvn.Application2;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ClassPathResource res=new ClassPathResource("SpringConfig.xml");
        XmlBeanFactory fc=new XmlBeanFactory(res);
        BeanClass mybean=(BeanClass) fc.getBean("mul");
        mybean.printMul();
    }
}

package com.mvn.collection_list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Specify the path to your XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");

        // Specify the ID of the bean you want to retrieve
        ATBean atb = (ATBean) context.getBean("institute");

        atb.print();
    }
}

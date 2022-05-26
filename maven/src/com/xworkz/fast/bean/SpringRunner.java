package com.xworkz.fast.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunner {

	public static void main(String[] args) {
		String xmlFile="resources/spring.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlFile);
 
		FastFood refFromSpring= applicationContext.getBean(FastFood.class);
		
		System.out.println(refFromSpring);
	}

}

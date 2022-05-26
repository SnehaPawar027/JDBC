package com.xworkz.headset.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HeadSetRunner {

	public static void main(String[] args) {

		String xmlFile = "resources/headsetSpring.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlFile);

		HeadSet headSet = applicationContext.getBean(HeadSet.class);
		System.out.println(headSet.getBrand());
		System.out.println(headSet.getColor());
		System.out.println(headSet.getHDSound());
		System.out.println(headSet.getPrice());
		System.out.println(headSet.isQuality());
		System.out.println(headSet.getMaterial());
		System.out.println(headSet.getConnectivityTechnologies());
		System.out.println(headSet.getFormFactor());

		HeadSet headSet1 = applicationContext.getBean("sony", HeadSet.class);
		System.out.println(headSet1.getBrand());

		HeadSet headSet2 = applicationContext.getBean("Red", HeadSet.class);
		System.out.println(headSet2.getColor());
		System.out.println(headSet2.getHDSound());

		HeadSet headSet3 = applicationContext.getBean("true", HeadSet.class);
		System.out.println(headSet3.getHDSound());
		System.out.println(headSet3.getPrice());

		HeadSet headSet4 = applicationContext.getBean("good", HeadSet.class);
		System.out.println(headSet4.isQuality());
		System.out.println(headSet4.getMaterial());

		HeadSet headSet5 = applicationContext.getBean("Rubber", HeadSet.class);
		System.out.println(headSet5.getMaterial());
		System.out.println(headSet5.getConnectivityTechnologies());
		System.out.println(headSet5.getFormFactor());

	}

}

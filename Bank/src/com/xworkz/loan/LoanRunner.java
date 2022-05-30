package com.xworkz.loan;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.salary.Salary;



public class LoanRunner {

	public static void main(String[] args) {
	
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resource/spring-bank.xml");
		System.out.println("Total objects managed: "+applicationContext.getBeanDefinitionCount());
		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
		
		Loan loan=applicationContext.getBean(Loan.class);
		boolean sactioned=loan.saction();
		System.out.println("sactioned"+ " " +sactioned);
		
	}

}

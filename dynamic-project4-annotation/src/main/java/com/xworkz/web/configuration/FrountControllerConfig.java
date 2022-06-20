package com.xworkz.web.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrountControllerConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	public FrountControllerConfig() {
		System.out.println("Running defualt construtor of FrountControllerConfig");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
	System.out.println("getRootConfigClasses");
		return new Class[] {BeanConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	System.out.println("getServletConfigClasses");
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings");
		return new String[] {"/"};
	}

}

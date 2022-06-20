package com.xworkz.web.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.xworkz.web")
@EnableWebMvc
public class BeanConfiguration implements WebMvcConfigurer {
	
	public BeanConfiguration() {
		System.out.println("Running defualt constuctor of BeanConfiguration");
	}
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "Register.jsp");
	}

}

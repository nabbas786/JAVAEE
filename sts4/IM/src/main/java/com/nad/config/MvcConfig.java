package com.nad.config;

import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

public class MvcConfig implements WebMvcConfigurer{

	public ViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver bean=new InternalResourceViewResolver();
		bean.setViewClass(JstlView.class);
		bean.setSuffix(".jsp");
		bean.setPrefix("/WEB-INF/jsp");
		return bean;
	}
}

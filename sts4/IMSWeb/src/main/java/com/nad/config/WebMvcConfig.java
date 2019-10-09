package com.nad.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class WebMvcConfig implements WebMvcConfigurer {

	@Bean
	public ViewResolver internalResourceViewResolver()
	{
		InternalResourceViewResolver bean=new InternalResourceViewResolver();
		bean.setPrefix("/WEB-INF/jsp");
		bean.setSuffix(".jsp");
		return bean;
	}
	
}

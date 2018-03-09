package com.udemy.backendninja.configuration;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.udemy.backendninja.Component.RequestTimeInterceptor;

@SuppressWarnings("unused")
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter{
	
	@Autowired
	@Qualifier("requestTimeInterceptor")
	private RequestTimeInterceptor requestTimeInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		 registry.addInterceptor(requestTimeInterceptor);
	}
	
	

}

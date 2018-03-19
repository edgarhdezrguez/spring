package com.udemy.backendninja.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import groovy.util.logging.Log;

@SuppressWarnings("unused")
@Component("requestTimeInterceptor")
public class RequestTimeInterceptor extends HandlerInterceptorAdapter {

	private static final org.apache.commons.logging.Log LOG = LogFactory.getLog(RequestTimeInterceptor.class);

	
	//primero
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		request.setAttribute("startTime",System.currentTimeMillis());
		return true;
	}
	
	//segundo
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		long startTime = (long) request.getAttribute("startTime");
		LOG.info("Url to '" + request.getRequestURL().toString() + "' in: '" + (System.currentTimeMillis() - startTime) + "ms'");
	}


	

}

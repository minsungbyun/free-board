package com.minsung.ch2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("request")
public class HttpServletRequestMethod {
	
	@RequestMapping("sample1")
	public String main(HttpServletRequest request, Model model) {
		
		String scheme = request.getScheme();
		String method = request.getMethod();
		String serverName = request.getServerName();
		int serverPort = request.getServerPort();
		String contextPath = request.getContextPath();
		String servletPath = request.getServletPath();
		String requestURI = request.getRequestURI();
		String requestURL = request.getRequestURL().toString();
		String queryString = request.getQueryString();
		
		
		model.addAttribute("scheme",scheme);
		model.addAttribute("method",method);
		model.addAttribute("serverName",serverName);
		model.addAttribute("serverPort",serverPort);
		model.addAttribute("contextPath",contextPath);
		model.addAttribute("servletPath",servletPath);
		model.addAttribute("requestURI",requestURI);
		model.addAttribute("requestURL",requestURL);
		model.addAttribute("queryString",queryString);
		
		
		return "method";
	} 

}

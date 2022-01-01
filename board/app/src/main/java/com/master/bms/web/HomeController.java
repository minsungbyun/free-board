package com.master.bms.web;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {
	
    private static Logger logger = LogManager.getLogger(HomeController.class);   

    @RequestMapping(value = "json", method = RequestMethod.GET)
	public String main() {
    	
    	logger.info("home controller start!!");
		
		return "jsonTest";
		
	}
}

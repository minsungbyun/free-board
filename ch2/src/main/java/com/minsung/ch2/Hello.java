package com.minsung.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	
	int iv = 20;
	
	@RequestMapping("hello")
	private void main() {
		System.out.println("Hello - private");
		System.out.println(iv);
		
	}
	
}

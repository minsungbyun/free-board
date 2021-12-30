package com.minsung.ch2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TwoDice {

	@RequestMapping("/rollDice")
	public void main(HttpServletResponse response) throws IOException {
		
		int idx1 = (int) (Math.random() * 6) + 1;
		int idx2 = (int) (Math.random() * 6) + 1;
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<img src='resources/img/dice"+idx1+".jpg'>");
		out.println("<img src='resources/img/dice"+idx2+".jpg'>");
		out.println("</body>");
		out.println("</html>");
//		out.write(test(idx1, idx2));
		
	}
	



//	private String test(int idx1, int idx2) {
//		
//		String result = "<img src='resources/img/dice"+index+".jpg'>";
//		StringBuffer result = new StringBuffer();
//		result.append("<html>");
//		result.append("<head>");
//		result.append("</head>");
//		result.append("<body>");
//		result.append("<img src='resources/img/dice"+idx1+".jpg'>");
//		result.append("<img src='resources/img/dice"+idx2+".jpg'>");
//		result.append("</body>");
//		result.append("</html>");
//		
//		return result.toString();
//	}
}

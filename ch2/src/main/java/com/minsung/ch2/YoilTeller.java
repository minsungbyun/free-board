package com.minsung.ch2;

import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class YoilTeller {
	
	@RequestMapping("/getYoil")
	public void main(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		
//		// 1. 입력
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.println("년을 입력해주세요 > ");
//		String year = bf.readLine();
//		System.out.println("월을 입력해주세요 > ");
//		String month = bf.readLine();
//		System.out.println("일을 입력해주세요 > ");
//		String day = bf.readLine();

		// 2. 변환
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);
		
		// 3. 작업
		Calendar cal = Calendar.getInstance();
		// 실제로 month + 1이 현재 달이 된다
		cal.set(yyyy, mm - 1, dd);
		
		// 일요일은 1부터 시작한다.
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("dayofWeek = > "+ dayOfWeek);
	// char yoil = " 일월화수목금토".charAt(dayOfWeek);
		String[] yoil = {"","일","월","화","수","목","금","토"};
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("yoil = "+ yoil[dayOfWeek]);
		
		
		
		
		
		
		
	} 

}

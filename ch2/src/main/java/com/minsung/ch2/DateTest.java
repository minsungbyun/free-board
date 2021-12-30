package com.minsung.ch2;

import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		
		Date today = new Date();

		System.out.println(today); //Date클래스의 toString()이 호출됨



		int year = today.getYear();

		System.out.println(year+1900);  // 메뉴얼 자체가 1900 더하게 되어있다..그냥 이렇게 써야함



		//월,일,시,분,초

		int hours = today.getHours();

		System.out.println(hours + "시");



		int minutes = today.getMinutes();

		System.out.println(minutes + "분"); 



		int month = today.getMonth();

		System.out.println((month+1) + "월");//메뉴얼 자체가 1 더하게 되어있다..



		int seconds = today.getSeconds();

		System.out.println(seconds + "초");



		String a = "";



		int day = today.getDay();

		switch (day){

		case 0 : a = "Sunday"; break;

		case 1 : a = "Monday"; break;

		case 2 : a = "Tuesday"; break;

		case 3 : a = "Wednesday"; break;

		case 4 : a = "Thursday"; break;

		case 5 : a = "Friday"; break;

		case 6 : a = "Saturday"; break;

		}


		System.out.println("오늘의 요일은 :  " + a);
		
	}
}

package com.minsung.ch2;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, Exception, IllegalAccessException {
		//Hello hello = new Hello();
		//hello.main();
		
		// Reflection API를 사용 - 클래스 정보를 얻고 다룰 수 있는 강력한 기능 제공
		Class<?> helloClass = Class.forName("com.minsung.ch2.Hello"); // Hello 클래스의 Class 객체를 얻어온다.
		Hello hello = (Hello) helloClass.newInstance(); // Class 객체가 가진 정보로 객체 생성
		Method main = helloClass.getDeclaredMethod("main");
		main.setAccessible(true); // private인 main()을 호출가능하게 한다.
		
		main.invoke(hello); // Hello.main();
	}

}

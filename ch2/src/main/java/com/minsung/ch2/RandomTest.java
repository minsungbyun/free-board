package com.minsung.ch2;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		long r = System.currentTimeMillis();
		
		System.out.println(r);

		//값 제한하기 0~9까지의 난수 발생

		System.out.println(r % 10);
		
		Random random = new Random();
		
		// 0 ~ bound - 1 범위까지의 난수 생성
		int result = random.nextInt(2);
		
		System.out.println(result);

	}

}

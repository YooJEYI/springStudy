package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {

	public static void main(String[] args) throws Exception {
//		Hello hello = new Hello();
//		hello.main();
		
		
		// Reflection API 사용 - 클래스 정보를 얻고 다룰 수 있는 강력한 기능제공
		Class helloClass = Class.forName("com.fastcamfus.ch2.Hello");
		Hello hello = (Hello)helloClass.newInstance();
		Method main = helloClass.getDeclaredMethod("main");
		main.setAccessible(true); //private인 main을 호출가능하게 한다.
		
		main.invoke(hello);
	}
	
}

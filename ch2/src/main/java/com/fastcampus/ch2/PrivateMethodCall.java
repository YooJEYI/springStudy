package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {

	public static void main(String[] args) throws Exception {
//		Hello hello = new Hello();
//		hello.main();
		
		
		// Reflection API ��� - Ŭ���� ������ ��� �ٷ� �� �ִ� ������ �������
		Class helloClass = Class.forName("com.fastcamfus.ch2.Hello");
		Hello hello = (Hello)helloClass.newInstance();
		Method main = helloClass.getDeclaredMethod("main");
		main.setAccessible(true); //private�� main�� ȣ�Ⱑ���ϰ� �Ѵ�.
		
		main.invoke(hello);
	}
	
}
package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	
	int iv = 10; //인스턴스 변수
	static int cv = 20; //static 변수
	
	@RequestMapping("/hello")
	private void main() {
		System.out.println("Hello");
		System.out.println(cv);
		System.out.println(iv);
	}
	
	
	public static void main2() { //static 메서드 - cv만 사용가능
		System.out.println(cv);
	}
	
}

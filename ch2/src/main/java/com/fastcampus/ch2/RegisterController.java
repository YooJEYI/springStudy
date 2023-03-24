package com.fastcampus.ch2;

import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

//	@GetMapping("/register/add")
//	public String register() {
//		return "registerForm";
//	}

//	@RequestMapping(value = "/register/save", method = RequestMethod.POST)
	@PostMapping("/register/save")
	public String save(User user, Model m) throws Exception{
		//1.��ȿ�� �˻�
		if(!isValid(user)) {
			String msg = URLEncoder.encode("id�� �߸��Է�", "utf-8");
			m.addAttribute("msg", msg);
			return "redirect:/register/add";
		}
		
		//2.DB �ű�ȸ�� ���� ����
		return "registerInfo";
	}

	private boolean isValid(User user) {
		return false;
	} 
		
	
}

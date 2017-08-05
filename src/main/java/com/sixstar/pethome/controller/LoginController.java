package com.sixstar.pethome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sixstar.pethome.AppConfig;
import com.sixstar.pethome.entity.Member;
import com.sixstar.pethome.service.service.MemberService;

@Controller
public class LoginController {

	@Autowired
	MemberService memberService;
	
	@GetMapping("/login")
	public String getLogin(Model model) {
		model.addAttribute("member",new Member());
		return "login";
	}
	
	@PostMapping("/login")
	public String postLogin(@ModelAttribute Member member,Model model) {
		
		Boolean loginResult=memberService.login(member.getName(), member.getPassword());
		
		if(loginResult) {
			AppConfig.nowMemberId=memberService.getMemberId(member.getName());
			Integer memberid=AppConfig.nowMemberId;
			Boolean res=memberid.equals(0);
			model.addAttribute("res", res);
			return "index";
		}else {
			return "loginwrong";
		}
		
	}
}

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
public class RegisterController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/register")
	public String getRegister(Model model) {
		model.addAttribute("member", new Member());
		return "register";
	}
	
	@PostMapping("/register")
	public String postRegister(@ModelAttribute Member member,Model model) {
		Integer registerResult=memberService.register(member.getName(), member.getPassword(),member.getAddress());
		if(registerResult==0) {
			Integer memberid=AppConfig.nowMemberId;
			Boolean res=memberid.equals(0);
			model.addAttribute("res", res);
			return "registerright";
		}else if(registerResult==1){
			return "registerwrong1";
		}else {
			return "registerwrong2";
		}
		
	}
}

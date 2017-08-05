package com.sixstar.pethome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sixstar.pethome.AppConfig;

@Controller
public class IndexController {

	@GetMapping("/")
	public String getIndex(Model model) {
		Integer memberid=AppConfig.nowMemberId;
		Boolean res=memberid.equals(0);
		model.addAttribute("res", res);
		return "index";
	}
}

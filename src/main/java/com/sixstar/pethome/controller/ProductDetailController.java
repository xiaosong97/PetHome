package com.sixstar.pethome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sixstar.pethome.AppConfig;
import com.sixstar.pethome.entity.Member;
import com.sixstar.pethome.object.DisplayProduct;
import com.sixstar.pethome.service.service.CartService;
import com.sixstar.pethome.service.service.ProductService;

@Controller
public class ProductDetailController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private CartService cartService;
	
	@GetMapping("/productdetail/{productid}")
	public String getProductDetail(@PathVariable Integer productid,Model model) {
		DisplayProduct product=productService.consultById(productid);
		model.addAttribute("product", product);
		Integer memberid=AppConfig.nowMemberId;
		Boolean res=memberid.equals(0);
		model.addAttribute("res", res);
		return "productdetail";
	}
	
	@RequestMapping("/productdetail/{productid}/add")
	public String addToCast(@PathVariable Integer productid,Model model) {
		Integer memberId=AppConfig.nowMemberId;
		if(memberId==0) {
			model.addAttribute("member",new Member());
			return "login";
		}
		cartService.addToCart(productid, memberId);
		Integer memberid=AppConfig.nowMemberId;
		Boolean res=memberid.equals(0);
		model.addAttribute("res", res);
		return "addright";
	}
}

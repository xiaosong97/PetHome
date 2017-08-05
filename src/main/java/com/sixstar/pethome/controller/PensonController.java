package com.sixstar.pethome.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sixstar.pethome.AppConfig;
import com.sixstar.pethome.entity.Member;
import com.sixstar.pethome.entity.MyOrder;
import com.sixstar.pethome.object.OrderProduct;
import com.sixstar.pethome.service.service.MemberService;
import com.sixstar.pethome.service.service.OrderService;

@Controller
public class PensonController {

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/person")
	public String getPerson(Model model) {
		Integer memberId=AppConfig.nowMemberId;
		if(memberId==0) {
			model.addAttribute("member",new Member());
			return "login";
		}
		Member member=memberService.showPersonData(memberId);
		model.addAttribute("member", member);
		return "person";
	}
	
	@RequestMapping("/logout")
	public String logout(Model model) {
		AppConfig.nowMemberId=0;
		Integer memberid=AppConfig.nowMemberId;
		Boolean res=memberid.equals(0);
		model.addAttribute("res", res);
		return "index";
	}
	
	@PostMapping("/person")
	public String updatePerson(@ModelAttribute Member member,Model model) {
		memberService.updateMember(member);
		Integer memberId=AppConfig.nowMemberId;
		if(memberId==0) {
			model.addAttribute("member",new Member());
			return "login";
		}
		member=memberService.showPersonData(memberId);
		model.addAttribute("member", member);
		return "person";
	}
	
	@GetMapping("/order")
	public String getOrder(Model model) { 
		Integer memberId=AppConfig.nowMemberId;
		if(memberId==0) {
			model.addAttribute("member",new Member());
			return "login";
		}
		List<MyOrder> myOrders = orderService.displayOrder(memberId);
		model.addAttribute("myOrders", myOrders);
		return "order";
	}
	
	@GetMapping("/orderdetail/{orderid}")
	public String getOrderDetail(@PathVariable("orderid") Integer orderId,Model model) {
		List<OrderProduct> orderProducts=orderService.displayOrderDetail(orderId);
		model.addAttribute("orderProducts", orderProducts);
		Member member=memberService.showPersonData(orderService.showOrder(orderId).getMemberId());
		model.addAttribute("member", member);
		MyOrder myOrder=orderService.showOrder(orderId);
		model.addAttribute("myOrder",myOrder);
		model.addAttribute("state", orderService.showOrder(orderId).getState());
		Double sum=0.0;
		for(OrderProduct orderProduct:orderProducts) {
			sum=sum+orderProduct.getPerPrice()*orderProduct.getNumber();
		}
		model.addAttribute("sum", sum);
		return "orderdetail";
	}
	
	@RequestMapping("/orderdetail/{orderid}/confirm")
	public String confirmOrder(@PathVariable("orderid") Integer orderId,Model model) {
		orderService.confirmOrder(orderId);
		Integer memberId=AppConfig.nowMemberId;
		if(memberId==0) {
			model.addAttribute("member",new Member());
			return "login";
		}
		List<MyOrder> myOrders = orderService.displayOrder(memberId);
		model.addAttribute("myOrders", myOrders);
		return "order";
	}
}

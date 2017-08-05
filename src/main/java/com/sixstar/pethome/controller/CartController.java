package com.sixstar.pethome.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sixstar.pethome.AppConfig;
import com.sixstar.pethome.entity.Member;
import com.sixstar.pethome.object.CartProduct;
import com.sixstar.pethome.service.service.CartService;
import com.sixstar.pethome.service.service.MemberService;
import com.sixstar.pethome.service.service.OrderService;

@Controller
public class CartController {

	@Autowired
	private CartService cartService;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/cart")
	public String getCart(Model model) {
		Integer memberId=AppConfig.nowMemberId;
		if(memberId==0) {
			model.addAttribute("member",new Member());
			return "login";
		}
		List<CartProduct> cartProducts=cartService.displayCart(memberId);
		model.addAttribute("cartProducts",cartProducts);
		Double sum=0.0;
		Integer totalnumber=0;
		for(CartProduct cartProduct:cartProducts) {
			if(cartProduct.getCart().getState()) {
				sum=sum+cartProduct.getProduct().getPerPrice()*cartProduct.getCart().getNumber();
				totalnumber=totalnumber+cartProduct.getCart().getNumber();
			}
		}
		model.addAttribute("sum", sum);
		model.addAttribute("totalnumber", totalnumber);
		return "cart";
	}
	
	@GetMapping("/placeorder")
	public String getPlaceOrder(Model model) {
		Integer memberId=AppConfig.nowMemberId;
		List<CartProduct> cartProducts=orderService.displayCartOrder(memberId);
		if(cartProducts.isEmpty()) {
			return "cartwrong";
		}
		model.addAttribute("cartProducts", cartProducts);
		Member member=memberService.showPersonData(memberId);
		model.addAttribute("member", member);
		Double sum=0.0;
		for(CartProduct product:cartProducts) {
			sum=sum+((product.getProduct().getPerPrice())*(product.getCart().getNumber()));
		}
		model.addAttribute("sum", sum);
		return "placeorder";
	}
	
	@RequestMapping("/placeorder/place")
	public String placeOrder() {
		Integer memberId=AppConfig.nowMemberId;
		orderService.placeAnOrder(memberId);
		return "placeright";
	}
	
	@RequestMapping("/cart/delete/{cartid}")
	public String deleteCart(@PathVariable("cartid") Integer cartId,Model model) {
		Integer memberId=AppConfig.nowMemberId;
		cartService.deleteCartProduct((Integer)cartId);
		List<CartProduct> cartProducts=cartService.displayCart(memberId);
		model.addAttribute("cartProducts",cartProducts);
		Double sum=0.0;
		Integer totalnumber=0;
		for(CartProduct cartProduct:cartProducts) {
			if(cartProduct.getCart().getState()) {
				sum=sum+cartProduct.getProduct().getPerPrice()*cartProduct.getCart().getNumber();
				totalnumber=totalnumber+cartProduct.getCart().getNumber();
			}
		}
		model.addAttribute("sum", sum);
		model.addAttribute("totalnumber", totalnumber);
		return "cart";
	}
	
	@RequestMapping("/cart/choose/{cartid}")
	public String chooseCart(@PathVariable("cartid") Integer cartId,Model model) {
		Integer memberId=AppConfig.nowMemberId;
		cartService.chooseCart((Integer)cartId);
		List<CartProduct> cartProducts=cartService.displayCart(memberId);
		model.addAttribute("cartProducts",cartProducts);
		Double sum=0.0;
		Integer totalnumber=0;
		for(CartProduct cartProduct:cartProducts) {
			if(cartProduct.getCart().getState()) {
				sum=sum+cartProduct.getProduct().getPerPrice()*cartProduct.getCart().getNumber();
				totalnumber=totalnumber+cartProduct.getCart().getNumber();
			}
		}
		model.addAttribute("sum", sum);
		model.addAttribute("totalnumber", totalnumber);
		return "cart";
	}
	
	@RequestMapping("/cart/plus/{cartid}")
	public String plusCart(@PathVariable("cartid") Integer cartId,Model model) {
		Integer memberId=AppConfig.nowMemberId;
		cartService.plusCart((Integer)cartId);
		List<CartProduct> cartProducts=cartService.displayCart(memberId);
		model.addAttribute("cartProducts",cartProducts);
		Double sum=0.0;
		Integer totalnumber=0;
		for(CartProduct cartProduct:cartProducts) {
			if(cartProduct.getCart().getState()) {
				sum=sum+cartProduct.getProduct().getPerPrice()*cartProduct.getCart().getNumber();
				totalnumber=totalnumber+cartProduct.getCart().getNumber();
			}
		}
		model.addAttribute("sum", sum);
		model.addAttribute("totalnumber", totalnumber);
		return "cart";
	}
	
	@RequestMapping("/cart/minus/{cartid}")
	public String minusCart(@PathVariable("cartid") Integer cartId,Model model) {
		Integer memberId=AppConfig.nowMemberId;
		cartService.minusCart((Integer)cartId);
		List<CartProduct> cartProducts=cartService.displayCart(memberId);
		model.addAttribute("cartProducts",cartProducts);
		Double sum=0.0;
		Integer totalnumber=0;
		for(CartProduct cartProduct:cartProducts) {
			if(cartProduct.getCart().getState()) {
				sum=sum+cartProduct.getProduct().getPerPrice()*cartProduct.getCart().getNumber();
				totalnumber=totalnumber+cartProduct.getCart().getNumber();
			}
		}
		model.addAttribute("sum", sum);
		model.addAttribute("totalnumber", totalnumber);
		return "cart";
	}
	
	@RequestMapping("/cart/chooseall")
	public String chooseAll(Model model) {
		Integer memberId=AppConfig.nowMemberId;
		cartService.chooseAllProduct(memberId);
		List<CartProduct> cartProducts=cartService.displayCart(memberId);
		model.addAttribute("cartProducts",cartProducts);
		Double sum=0.0;
		Integer totalnumber=0;
		for(CartProduct cartProduct:cartProducts) {
			if(cartProduct.getCart().getState()) {
				sum=sum+cartProduct.getProduct().getPerPrice()*cartProduct.getCart().getNumber();
				totalnumber=totalnumber+cartProduct.getCart().getNumber();
			}
		}
		model.addAttribute("sum", sum);
		model.addAttribute("totalnumber", totalnumber);
		return "cart";
	}
}

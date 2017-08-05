package com.sixstar.pethome.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sixstar.pethome.AppConfig;
import com.sixstar.pethome.object.DisplayProduct;
import com.sixstar.pethome.service.service.ProductService;

@Controller
public class ProductListController {

	@Autowired
	private ProductService productService;
	

	
	@GetMapping("/productlist/1")
	public String getProductByAmimal(@PathParam("animal") String animal,Model model) {
		List<DisplayProduct> displayProducts = productService.consultByAnimal(animal);
		model.addAttribute("displayProducts", displayProducts);
		Integer memberid=AppConfig.nowMemberId;
		Boolean res=memberid.equals(0);
		model.addAttribute("res", res);
		return "productlist";
	}
	
	@GetMapping("/productlist/2")
	public String getProductByClassification(@PathParam("classification") String classification,Model model) {
		List<DisplayProduct> displayProducts = productService.consultByClassifiaction(classification);
		model.addAttribute("displayProducts", displayProducts);
		Integer memberid=AppConfig.nowMemberId;
		Boolean res=memberid.equals(0);
		model.addAttribute("res", res);
		return "productList";
	}
	
	@GetMapping("/productlist/3")
	public String getProductByAnimalAndClassification(@PathParam("animal") String animal, @PathParam("classification") String classification, Model model) {
		List<DisplayProduct> displayProducts = productService.consultByAnimalAndClassification(animal, classification);
		model.addAttribute("displayProducts", displayProducts);
		Integer memberid=AppConfig.nowMemberId;
		Boolean res=memberid.equals(0);
		model.addAttribute("res", res);
		return "productList";
	}
}

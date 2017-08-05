package com.sixstar.pethome.object;

import com.sixstar.pethome.entity.Photo;
import com.sixstar.pethome.entity.Product;

public class OrderProduct {

	//用于订单页面的商品
	private Product product;
	private Photo titlePhoto;
	private Double perPrice;
	private Integer number;
	public OrderProduct(Product product, Photo titlePhoto, Double perPrice, Integer number) {
		super();
		this.product = product;
		this.titlePhoto = titlePhoto;
		this.perPrice = perPrice;
		this.number = number;
	}
	public OrderProduct() {
		super();
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Photo getTitlePhoto() {
		return titlePhoto;
	}
	public void setTitlePhoto(Photo titlePhoto) {
		this.titlePhoto = titlePhoto;
	}
	public Double getPerPrice() {
		return perPrice;
	}
	public void setPerPrice(Double perPrice) {
		this.perPrice = perPrice;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	
}

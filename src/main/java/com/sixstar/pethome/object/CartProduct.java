package com.sixstar.pethome.object;

import com.sixstar.pethome.entity.Cart;
import com.sixstar.pethome.entity.Photo;
import com.sixstar.pethome.entity.Product;

public class CartProduct {
	//用于购物车页面的商品展示
	private Product product;
	private Photo titlePhoto;
	private Cart cart;
	public CartProduct() {
		super();
	}
	public CartProduct(Product product, Photo titlePhoto, Cart cart) {
		super();
		this.product = product;
		this.titlePhoto = titlePhoto;
		this.cart = cart;
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
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	
}

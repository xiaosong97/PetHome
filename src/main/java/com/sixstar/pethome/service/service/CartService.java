package com.sixstar.pethome.service.service;

import java.util.List;

import com.sixstar.pethome.object.CartProduct;

public interface CartService {

	//加入购物车
	public Boolean addToCart(Integer productId,Integer memberId);
	//展示购物车商品
	public List<CartProduct> displayCart(Integer memberId);
	//选中购物车商品
	public Boolean chooseCart(Integer cartId);
	//增加商品
	public Boolean plusCart(Integer cartId);
	//减少商品
	public Boolean minusCart(Integer cartId);
	//删除购物车商品
	public Boolean deleteCartProduct(Integer cartId);
	//全选购物车商品
	public Boolean chooseAllProduct(Integer memberId);
	
}

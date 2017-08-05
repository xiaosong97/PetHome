package com.sixstar.pethome.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixstar.pethome.entity.Cart;
import com.sixstar.pethome.entity.Photo;
import com.sixstar.pethome.entity.Product;
import com.sixstar.pethome.object.CartProduct;
import com.sixstar.pethome.repository.CartReponsitory;
import com.sixstar.pethome.repository.PhotoManagerReponsitory;
import com.sixstar.pethome.repository.PhotoReponsitory;
import com.sixstar.pethome.repository.ProductReponsitory;
import com.sixstar.pethome.service.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	
	@Autowired
	private CartReponsitory cartReponsitory;
	
	@Autowired
	private ProductReponsitory productReponsitory;
	
	@Autowired
	private PhotoReponsitory photoReponsitory;
	
	@Autowired
	private PhotoManagerReponsitory photoManagerReponsitory;

	
	
	@Override
	public Boolean addToCart(Integer productId,Integer memberId) {
		// TODO Auto-generated method stub
		
		List<Cart> carts=cartReponsitory.findByMemberId(memberId);
		
		Integer test=0;
		
		for(Cart cart:carts) {
			if(cart.getProductId().equals(productId)) {
				cart.setNumber(cart.getNumber()+1);
				cartReponsitory.save(cart);
				test=1;
			}
		}
		if(test==0) {
			cartReponsitory.save(new Cart(memberId, productId, 1, true));
		}
		
		return true;
	}

	@Override
	public List<CartProduct> displayCart(Integer memberId) {
		// TODO Auto-generated method stub
		
		List<CartProduct> cartProducts = new ArrayList<>();
		
		List<Cart> carts=cartReponsitory.findByMemberId(memberId);
		for(Cart cart:carts) {
			// 产品
			Product product=productReponsitory.findOne(cart.getProductId());
			// 标题图
			Photo titlePhoto=photoReponsitory.findOne(photoManagerReponsitory.findByProductIdAndType(product.getId(), "标题图").get(0).getPhotoId());
			cartProducts.add(new CartProduct(product, titlePhoto, cart));
		}
		return cartProducts;
	}


	@Override
	public Boolean deleteCartProduct(Integer cartId) {
		// TODO Auto-generated method stub
		Cart cart=cartReponsitory.findOne(cartId);
		cartReponsitory.delete(cart);
		return true;
	}

	@Override
	public Boolean chooseCart(Integer cartId) {
		// TODO Auto-generated method stub
		Cart cart=cartReponsitory.findOne(cartId);
		cart.setState(!cart.getState());
		cartReponsitory.save(cart);
		return true;
	}
	

	@Override
	public Boolean plusCart(Integer cartId) {
		// TODO Auto-generated method stub
		Cart cart=cartReponsitory.findOne(cartId);
		cart.setNumber(cart.getNumber()+1);
		cartReponsitory.save(cart);
		return true;
	}

	@Override
	public Boolean minusCart(Integer cartId) {
		// TODO Auto-generated method stub
		Cart cart=cartReponsitory.findOne(cartId);
		if(cart.getNumber()>1) {
			cart.setNumber(cart.getNumber()-1);
		}
		cartReponsitory.save(cart);
		return true;
	}

	@Override
	public Boolean chooseAllProduct(Integer memberId) {
		// TODO Auto-generated method stub
		List<Cart> carts=cartReponsitory.findByMemberId(memberId);
		for(Cart cart:carts) {
			cart.setState(true);
			cartReponsitory.save(cart);
		}
		return true;
	}

}

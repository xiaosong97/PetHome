package com.sixstar.pethome.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sixstar.pethome.entity.Cart;
import com.sixstar.pethome.entity.MyOrder;
import com.sixstar.pethome.entity.OrderDetail;
import com.sixstar.pethome.entity.Photo;
import com.sixstar.pethome.entity.Product;
import com.sixstar.pethome.object.CartProduct;
import com.sixstar.pethome.object.OrderProduct;
import com.sixstar.pethome.repository.CartReponsitory;
import com.sixstar.pethome.repository.MyOrderReponsitory;
import com.sixstar.pethome.repository.OrderDetailReponsitory;
import com.sixstar.pethome.repository.PhotoManagerReponsitory;
import com.sixstar.pethome.repository.PhotoReponsitory;
import com.sixstar.pethome.repository.ProductReponsitory;
import com.sixstar.pethome.service.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private CartReponsitory cartReponsitory;
	
	@Autowired
	private ProductReponsitory productReponsitory;
	
	@Autowired
	private PhotoReponsitory photoReponsitory;
	
	@Autowired
	private PhotoManagerReponsitory photoManagerReponsitory;
	
	@Autowired
	private MyOrderReponsitory myOrderReponsitory;
	
	@Autowired
	private OrderDetailReponsitory orderDetailReponsitory;
	
	

	
	
	@Override
	public List<CartProduct> displayCartOrder(Integer memberId) {
		// TODO Auto-generated method stub
		// 展示订单，进行下单
		List<CartProduct> cartProducts = new ArrayList<>();
		// 选取购物车中选中的商品
		List<Cart> carts=cartReponsitory.findByMemberIdAndState(memberId, true);
		for(Cart cart:carts) {
			// 商品
			Product product=productReponsitory.findOne(cart.getProductId());
			// 标题图
			Photo titlePhoto=photoReponsitory.findOne(photoManagerReponsitory.findByProductIdAndType(product.getId(), "标题图").get(0).getPhotoId());
			cartProducts.add(new CartProduct(product, titlePhoto, cart));
		}
		return cartProducts;
		
	}

	@Override
	@Transactional
	public Boolean placeAnOrder(Integer memberId) {
		// TODO Auto-generated method stub
		// 下单
		// 获取当前时间
		Timestamp riseTime=new Timestamp(System.currentTimeMillis());
		// 生成订单
		MyOrder myOrder=new MyOrder(memberId, riseTime, false);
		
		myOrderReponsitory.save(myOrder);
		
		// 获取订单号
		List<MyOrder> myOrders=myOrderReponsitory.findByMemberId(memberId);
		Integer orderId=myOrders.get(myOrders.size()-1).getId();
		
		// 订单详情录入
		List<Cart> carts=cartReponsitory.findByMemberIdAndState(memberId, true);
		for(Cart cart:carts) {
			orderDetailReponsitory.save(new OrderDetail(orderId, cart.getProductId(), productReponsitory.findOne(cart.getProductId()).getPerPrice(), cart.getNumber()));
			cartReponsitory.delete(cart);
		}
		
		return true;
		
	}

	@Override
	public List<MyOrder> displayOrder(Integer memberId) {
		// TODO Auto-generated method stub
		// 展示订单
		List<MyOrder> myOrders=myOrderReponsitory.findByMemberId(memberId);
		
		return myOrders;
	}

	@Override
	public List<OrderProduct> displayOrderDetail(Integer orderId) {
		// TODO Auto-generated method stub
		// 展示订单详情
		List<OrderProduct> orderProducts = new ArrayList<>();
		
		List<OrderDetail> orderDetails = orderDetailReponsitory.findByOrderId(orderId);
		for(OrderDetail orderDetail:orderDetails) {
			Product product=productReponsitory.findOne(orderDetail.getProductId());
			Photo titlePhoto=photoReponsitory.findOne(photoManagerReponsitory.findByProductIdAndType(product.getId(), "标题图").get(0).getPhotoId());
			orderProducts.add(new OrderProduct(product, titlePhoto, orderDetail.getPerPrice(), orderDetail.getNumber()));
		}
		
		return orderProducts;
	}

	@Override
	public Boolean confirmOrder(Integer orderId) {
		// TODO Auto-generated method stub
		// 订单确认
		MyOrder myOrder=myOrderReponsitory.findOne(orderId);
		
		if(!(myOrder.getState())) {
			myOrder.setState(true);
			myOrderReponsitory.save(myOrder);
		}
		
		return true;
	}

	@Override
	public MyOrder showOrder(Integer orderId) {
		// TODO Auto-generated method stub
		MyOrder myOrder=myOrderReponsitory.findOne(orderId);
		return myOrder;
	}

}

package com.sixstar.pethome.service.service;

import java.util.List;

import com.sixstar.pethome.entity.MyOrder;
import com.sixstar.pethome.object.CartProduct;
import com.sixstar.pethome.object.OrderProduct;

public interface OrderService {

	//展示下单商品
	public List<CartProduct> displayCartOrder(Integer memberId);
	//生成订单
	public Boolean placeAnOrder(Integer memberId);
	//展示用户订单
	public List<MyOrder> displayOrder(Integer memberId);
	//展示订单详情
	public List<OrderProduct> displayOrderDetail(Integer orderId);
	//展示订单
	public MyOrder showOrder(Integer orderId);
	//确认订单收货
	public Boolean confirmOrder(Integer orderId);
}

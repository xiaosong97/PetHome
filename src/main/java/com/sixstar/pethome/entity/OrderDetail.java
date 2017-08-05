package com.sixstar.pethome.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderDetail {

	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer orderId;
	private Integer productId;
	private Double perPrice;
	private Integer number;
	public OrderDetail() {
		super();
	}
	public OrderDetail(Integer id, Integer orderId, Integer productId, Double perPrice, Integer number) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.productId = productId;
		this.perPrice = perPrice;
		this.number = number;
	}
	
	public OrderDetail(Integer orderId, Integer productId, Double perPrice, Integer number) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.perPrice = perPrice;
		this.number = number;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
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

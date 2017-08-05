package com.sixstar.pethome.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer memberId;
	private Integer productId;
	
	private Integer number;
	private Boolean state;		//是否选中
	public Cart() {
		super();
	}
	public Cart(Integer id, Integer memberId, Integer productId, Integer number, Boolean state) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.productId = productId;
		this.number = number;
		this.state = state;
	}
	
	
	public Cart(Integer memberId, Integer productId, Integer number, Boolean state) {
		super();
		this.memberId = memberId;
		this.productId = productId;
		this.number = number;
		this.state = state;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
	
	
	
}

package com.sixstar.pethome.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MyOrder {

	@Id
	@GeneratedValue
	private Integer id;
	private Integer memberId;
	private Timestamp riseTime;
	private Boolean state;
	public MyOrder() {
		super();
	}
	public MyOrder(Integer id, Integer memberId, Timestamp riseTime, Boolean state) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.riseTime = riseTime;
		this.state = state;
	}
	
	public MyOrder(Integer memberId, Timestamp riseTime, Boolean state) {
		super();
		this.memberId = memberId;
		this.riseTime = riseTime;
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
	public Timestamp getRiseTime() {
		return riseTime;
	}
	public void setRiseTime(Timestamp riseTime) {
		this.riseTime = riseTime;
	}
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
	
	
}

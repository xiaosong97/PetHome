package com.sixstar.pethome.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	private String realName;
	private String password;
	private String sex;
	private String telephone;
	private String email;
	private String address;
	public Member() {
		super();
	}
	public Member(Integer id, String name, String realName, String password, String sex, String telephone, String email,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.realName = realName;
		this.password = password;
		this.sex = sex;
		this.telephone = telephone;
		this.email = email;
		this.address = address;
	}
	
	
	public Member(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

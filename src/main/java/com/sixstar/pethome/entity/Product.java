package com.sixstar.pethome.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	private Double perPrice;
	private String introduction;
	private String animal;
	private String classification;
	public Product() {
		super();
	}

	
	public Product(Integer id, String name, Double perPrice, String introduction, String animal,
			String classification) {
		super();
		this.id = id;
		this.name = name;
		this.perPrice = perPrice;
		this.introduction = introduction;
		this.animal = animal;
		this.classification = classification;
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
	public Double getPerPrice() {
		return perPrice;
	}
	public void setPerPrice(Double perPrice) {
		this.perPrice = perPrice;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	
}

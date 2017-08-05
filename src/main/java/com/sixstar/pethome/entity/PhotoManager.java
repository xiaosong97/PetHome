package com.sixstar.pethome.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PhotoManager {

	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer productId;
	private Integer photoId;
	private String type;		//图片类型
	public PhotoManager() {
		super();
	}
	public PhotoManager(Integer id, Integer productId, Integer photoId, String type) {
		super();
		this.id = id;
		this.productId = productId;
		this.photoId = photoId;
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getPhotoId() {
		return photoId;
	}
	public void setPhotoId(Integer photoId) {
		this.photoId = photoId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}

package com.sixstar.pethome.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Photo {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	private String path;
	public Photo() {
		super();
	}
	public Photo(Integer id, String name, String path) {
		super();
		this.id = id;
		this.name = name;
		this.path = path;
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
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
}

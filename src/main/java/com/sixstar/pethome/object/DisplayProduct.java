package com.sixstar.pethome.object;

import java.util.List;

import com.sixstar.pethome.entity.Photo;
import com.sixstar.pethome.entity.Product;

public class DisplayProduct {

	//用于商品展示界面的商品
	private Product product;
	private Photo titlePhoto;
	private List<Photo> displayPhotos;
	public DisplayProduct(Product product, Photo titlePhoto, List<Photo> displayPhotos) {
		super();
		this.product = product;
		this.titlePhoto = titlePhoto;
		this.displayPhotos = displayPhotos;
	}
	public DisplayProduct(Product product, Photo titlePhoto) {
		super();
		this.product = product;
		this.titlePhoto = titlePhoto;
	}

	public DisplayProduct() {
		super();
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Photo getTitlePhoto() {
		return titlePhoto;
	}
	public void setTitlePhoto(Photo titlePhoto) {
		this.titlePhoto = titlePhoto;
	}
	public List<Photo> getDisplayPhotos() {
		return displayPhotos;
	}
	public void setDisplayPhotos(List<Photo> displayPhotos) {
		this.displayPhotos = displayPhotos;
	}
	
	
	
}

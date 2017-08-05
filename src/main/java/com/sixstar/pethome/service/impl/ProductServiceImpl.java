package com.sixstar.pethome.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixstar.pethome.entity.Photo;
import com.sixstar.pethome.entity.PhotoManager;
import com.sixstar.pethome.entity.Product;
import com.sixstar.pethome.object.DisplayProduct;
import com.sixstar.pethome.repository.PhotoManagerReponsitory;
import com.sixstar.pethome.repository.PhotoReponsitory;
import com.sixstar.pethome.repository.ProductReponsitory;
import com.sixstar.pethome.service.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductReponsitory productReponsitory;
	
	@Autowired
	private PhotoReponsitory photoReponsitory;
	
	@Autowired
	private PhotoManagerReponsitory photoManagerReponsitory;

	

	

	
	
	@Override
	public DisplayProduct consultById(Integer id) {
		DisplayProduct displayProduct = new DisplayProduct();
		// 获取商品
		Product product=productReponsitory.findOne(id);
		displayProduct.setProduct(product);
		
		List<PhotoManager> titlePhotoManagers=photoManagerReponsitory.findByProductIdAndType(product.getId(), "标题图");
		List<PhotoManager> displayPhotoManagers=photoManagerReponsitory.findByProductIdAndType(product.getId(), "展示图");
		
		// 获取标题图片
		Photo titlePhoto=photoReponsitory.findOne(titlePhotoManagers.get(0).getPhotoId());
		displayProduct.setTitlePhoto(titlePhoto);
		
		// 获取展示图片
		List<Photo> displayPhotos = new ArrayList<>();
		for(PhotoManager photoManager:displayPhotoManagers) {
			displayPhotos.add(photoReponsitory.findOne(photoManager.getPhotoId()));
		}
		displayProduct.setDisplayPhotos(displayPhotos);
		
		return displayProduct;
	}

	@Override
	public List<DisplayProduct> consultByAnimal(String animal) {
		// TODO Auto-generated method stub
		
		List<DisplayProduct> displayProducts=new ArrayList<>();
		
		
		List<Product> products=productReponsitory.findByAnimal(animal);
		for(Product product:products) {
			Photo titlePhoto=photoReponsitory.findOne(photoManagerReponsitory.findByProductIdAndType(product.getId(), "标题图").get(0).getPhotoId());
			displayProducts.add(new DisplayProduct(product, titlePhoto));
		}
		return displayProducts;
	}
	

	@Override
	public List<DisplayProduct> consultByClassifiaction(String classification) {
		// TODO Auto-generated method stub
		
		List<DisplayProduct> displayProducts =new ArrayList<>();
		
		List<Product> products=productReponsitory.findByClassification(classification);
		for(Product product:products) {
			Photo titlePhoto=photoReponsitory.findOne(photoManagerReponsitory.findByProductIdAndType(product.getId(), "标题图").get(0).getPhotoId());
			displayProducts.add(new DisplayProduct(product, titlePhoto));
		}
		return displayProducts;
	}

	@Override
	public List<DisplayProduct> consultByAnimalAndClassification(String animal, String classification) {
		// TODO Auto-generated method stub
		List<DisplayProduct> displayProducts= new ArrayList<>();
		
		List<Product> products=productReponsitory.findByAnimalAndClassification(animal, classification);
		for(Product product:products) {
			Photo titlePhoto=photoReponsitory.findOne(photoManagerReponsitory.findByProductIdAndType(product.getId(), "标题图").get(0).getPhotoId());
			displayProducts.add(new DisplayProduct(product, titlePhoto));
		}
		return displayProducts;
	}

}

package com.sixstar.pethome.service.service;

import java.util.List;

import com.sixstar.pethome.object.DisplayProduct;

public interface ProductService {

	//展示商品详情
	public DisplayProduct consultById(Integer id);
	//按照动物分类
	public List<DisplayProduct> consultByAnimal(String animal);
	//按照类别分类
	public List<DisplayProduct> consultByClassifiaction(String classification);
	//按照动物和类别分类
	public List<DisplayProduct> consultByAnimalAndClassification(String animal,String classification);
	
}

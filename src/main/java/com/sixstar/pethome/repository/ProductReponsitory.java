 package com.sixstar.pethome.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sixstar.pethome.entity.Product;

@Repository
public interface ProductReponsitory extends JpaRepository<Product, Integer> {

	List<Product> findByAnimal(String animal);
	
	List<Product> findByClassification(String classification);
	
	List<Product> findByAnimalAndClassification(String animal,String classification);
}

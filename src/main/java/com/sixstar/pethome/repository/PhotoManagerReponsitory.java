package com.sixstar.pethome.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sixstar.pethome.entity.PhotoManager;

@Repository
public interface PhotoManagerReponsitory extends JpaRepository<PhotoManager, Integer> {

	List<PhotoManager> findByProductIdAndType(Integer productId,String type);
}

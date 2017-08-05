package com.sixstar.pethome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sixstar.pethome.entity.Photo;

@Repository
public interface PhotoReponsitory extends JpaRepository<Photo, Integer> {

}

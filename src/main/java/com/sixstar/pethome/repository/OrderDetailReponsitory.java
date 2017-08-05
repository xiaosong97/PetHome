package com.sixstar.pethome.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sixstar.pethome.entity.OrderDetail;

@Repository
public interface OrderDetailReponsitory extends JpaRepository<OrderDetail, Integer> {

	List<OrderDetail> findByOrderId(Integer orderId);
}

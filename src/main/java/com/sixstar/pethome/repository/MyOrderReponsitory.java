package com.sixstar.pethome.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sixstar.pethome.entity.MyOrder;

@Repository
public interface MyOrderReponsitory extends JpaRepository<MyOrder, Integer> {
	List<MyOrder> findByMemberId(Integer memberId);
	
	MyOrder findByMemberIdAndRiseTime(Integer memberId,Timestamp riseTime);
	
}

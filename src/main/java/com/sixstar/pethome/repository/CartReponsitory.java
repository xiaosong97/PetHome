package com.sixstar.pethome.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sixstar.pethome.entity.Cart;

@Repository
public interface CartReponsitory extends JpaRepository<Cart, Integer> {

	List<Cart> findByMemberId(Integer memberId);
	
	Cart findByMemberIdAndProductId(Integer memberId,Integer productId);
	
	List<Cart> findByMemberIdAndState(Integer memberId,Boolean state);
}

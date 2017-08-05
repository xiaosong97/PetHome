package com.sixstar.pethome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sixstar.pethome.entity.Member;

@Repository
public interface MemberReponsitory extends JpaRepository<Member, Integer> {

	Member findByName(String name);
	
	Member findByNameAndPassword(String name,String password);
	
}

package com.sixstar.pethome.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixstar.pethome.AppConfig;
import com.sixstar.pethome.entity.Member;
import com.sixstar.pethome.repository.MemberReponsitory;

@Service
public class MemberServiceImpl implements com.sixstar.pethome.service.service.MemberService {

	@Autowired
	private MemberReponsitory memberReponsitory;
	
	
	@Override
	public Boolean login(String name, String password) {
		// TODO Auto-generated method stub
		// 登录
		// 寻找用户名以及密码
		List<Member> members=memberReponsitory.findAll();
		for(Member member:members) {
			if(member.getName().equals(name) && member.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
		
	}

	@Override
	public Integer register(String name, String password,String password2) {
		// TODO Auto-generated method stub
		// 注册
		if(name.equals("")||password.equals("")) {
			return 2;
		}
		if(!password.equals(password2)) {
			return 2;
		}
		List<Member> members=memberReponsitory.findAll();
		// 寻找是否存在同名
		for(Member member:members) {
			if(member.getName().equals(name)) {
				return 1;
			}
		}
		memberReponsitory.save(new Member(name, password));
		AppConfig.nowMemberId=memberReponsitory.findByName(name).getId();
		return 0;
	}

	@Override
	public Boolean updateMember(Member member) {
		// TODO Auto-generated method stub
		// need to change
		Member oldMember=memberReponsitory.findOne(AppConfig.nowMemberId);
		oldMember.setAddress(member.getAddress());
		oldMember.setEmail(member.getEmail());
		oldMember.setRealName(member.getRealName());
		oldMember.setSex(member.getSex());
		oldMember.setTelephone(member.getTelephone());
		memberReponsitory.save(oldMember);
	
		return true;
	}

	@Override
	public Member showPersonData(Integer memberId) {
		// TODO Auto-generated method stub
		
		Member member=memberReponsitory.findOne(memberId);
		
		return member;
	}

	@Override
	public Integer getMemberId(String name) {
		// TODO Auto-generated method stub
		return memberReponsitory.findByName(name).getId();
	}

	
	
	
	

}

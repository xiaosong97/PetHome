package com.sixstar.pethome.service.service;


import com.sixstar.pethome.entity.Member;

public interface MemberService {

	//登录
	public Boolean login(String name,String password);
	//注册
	public Integer register(String name,String password,String password2);
	//更新个人信息
	public Boolean updateMember(Member member);
	//显示个人信息
	public Member showPersonData(Integer memberId);
	//获取用户Id
	public Integer getMemberId(String name);
}

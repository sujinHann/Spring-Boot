package com.example.myapp.model;

import org.apache.ibatis.annotations.Mapper;

import com.example.myapp.model.vo.MemberVO;

@Mapper
public interface MemberMapper {
	
	public MemberVO findMemberById(String id);
}
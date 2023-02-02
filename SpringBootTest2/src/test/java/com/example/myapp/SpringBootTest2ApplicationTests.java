package com.example.myapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.myapp.model.MemberMapper;

import jakarta.annotation.Resource;

@SpringBootTest
class SpringBootTest2ApplicationTests {

	@Resource
	private MemberMapper mm;
	
	@Test
	void contextLoads() {
		System.out.println(mm.findMemberById("java"));
		//MemberVO [id=java, pasword=null, name=아이유, address=판교]
	}
}

package com.example.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.myapp.model.MemberMapper;
import org.springframework.ui.Model;
import jakarta.annotation.Resource;

@Controller
public class MemberController {
	
	@Resource
	private MemberMapper memberMapper;
	
	@RequestMapping("find-member-form.do")
	public String findMemberForm() {
		return "find-member-form";
	}
	
	@RequestMapping("findMemberById.do")
	public String findMemberById(String id, Model model) {
		model.addAttribute("mvo", memberMapper.findMemberById(id));
		return "find-member-result";
	}
}

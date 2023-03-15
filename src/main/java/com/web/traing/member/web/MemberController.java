package com.web.traing.member.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.traing.member.service.MemberService;
import com.web.traing.member.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/member", method=RequestMethod.GET)
	public String index(Model model) {
		
		List<MemberVO> memberList = memberService.getAllMember();
		System.out.println("size: " + memberList.size());
		
		
		model.addAttribute("memberList",memberList);
		return "member/member";
	}
}
package com.web.traing.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.traing.member.mapper.MemberMapper;
import com.web.traing.member.vo.MemberVO;


@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public List<MemberVO> getAllMember(){
		return memberMapper.getAllMember();
	}
}
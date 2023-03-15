package com.web.traing.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.web.traing.member.vo.MemberVO;

@Mapper
public interface MemberMapper {
	List<MemberVO> getAllMember();
}

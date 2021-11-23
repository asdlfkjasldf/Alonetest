package com.mycompany.myapp21112302.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp21112302.member.model.dao.MemberDao;
import com.mycompany.myapp21112302.member.model.vo.Member;

@Service("memberService")
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao memberDao;
	
	@Override
	public int signUp(Member m) throws Exception {
		return memberDao.signUp(m);
	}
}

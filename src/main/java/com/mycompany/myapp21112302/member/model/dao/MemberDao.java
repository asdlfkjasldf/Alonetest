package com.mycompany.myapp21112302.member.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp21112302.member.model.vo.Member;


@Repository("memberdao")
public class MemberDao {

	@Autowired
	private SqlSession sqlSession;
	
	private MemberDao() {}
	
	public int signUp(Member m) throws Exception {
		return sqlSession.insert("Member.signUp", m);
	}
}


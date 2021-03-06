package com.mycompany.myapp21112302.member.model.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class Member {
	/*
	MEMBER_ID VARCHAR2(30) PRIMARY KEY,
	MEMBER_PWD VARCHAR2(100) NOT NULL,
	MEMBER_NM VARCHAR2(15) NOT NULL,
	MEMBER_ENROLL_DT DATE DEFAULT SYSDATE
	*/
	
	private static final long serialVersionUID = 1111L;
	
	private String member_id;
	private String member_pwd;
	private String member_nm;
	private Date member_enroll_dt;
	
	public Member() {}
	
	public Member(String member_id, String member_pwd, String member_nm, Date member_enroll_dt) {
		super();
		this.member_id = member_id;
		this.member_pwd = member_pwd;
		this.member_nm = member_nm;
		this.member_enroll_dt = member_enroll_dt;
	}

	@Override
	public String toString() {
		return "Member [member_id=" + member_id + ", member_pwd=" + member_pwd + ", member_nm=" + member_nm
				+ ", member_enroll_dt=" + member_enroll_dt + "]";
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pwd() {
		return member_pwd;
	}

	public void setMember_pwd(String member_pwd) {
		this.member_pwd = member_pwd;
	}

	public String getMember_nm() {
		return member_nm;
	}

	public void setMember_nm(String member_nm) {
		this.member_nm = member_nm;
	}

	public Date getMember_enroll_dt() {
		return member_enroll_dt;
	}

	public void setMember_enroll_dt(Date member_enroll_dt) {
		this.member_enroll_dt = member_enroll_dt;
	}
	
	
}


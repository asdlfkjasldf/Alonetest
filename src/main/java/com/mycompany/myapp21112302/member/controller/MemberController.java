package com.mycompany.myapp21112302.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mycompany.myapp21112302.member.model.service.MemberService;
import com.mycompany.myapp21112302.member.model.vo.Member;

@Controller
@SessionAttributes("msg")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/")
	public String signUp(Member m, Model model) {
		logger.info("singUp 진입 성공");
		
		int result = -1;
		
		try {
			result = memberService.signUp(m);
			if(result == 1) {
				model.addAttribute("msg", "회원가입 성공");
			} else {
				model.addAttribute("msg", "회원가입 실패");
			}
		} catch(Exception e) {
			e.printStackTrace();
			model.addAttribute("msg", "회원가입 과정에서 오류 발생");
		}
		return "redirect:/";
	}	
}
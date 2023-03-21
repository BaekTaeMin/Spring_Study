package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inhatc.domain.MemberVO;

@Controller
public class CSController4 {

	@RequestMapping("doE")
	public String doE(Model model) {
		
		MemberVO member = new MemberVO("น้ลยนฮ");
		model.addAttribute(member);
		
		return "member";
	}
}

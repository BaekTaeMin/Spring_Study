package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inhatc.domain.ProductVO;

@Controller
public class CSController6 {

	@RequestMapping("doJSON")
	public @ResponseBody ProductVO doJSON() {
		ProductVO vo = new ProductVO("Inhatc1", 100);
		System.out.println("doJSON called");
		
		return vo;
	}
}

package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inhatc.domain.ProductVO;

@Controller
public class CSController3 {

	@RequestMapping("doD")
	public String doD( Model model ) {
		
		System.out.println("doD Called");
		ProductVO product = new ProductVO("inhatc Product", 1000);
		
		model.addAttribute(product);
		return "productDetail";
	}
}

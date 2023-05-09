package com.inhatc.cs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inhatc.domain.BoardVO;
import com.inhatc.service.BoardService;

@Controller
@RequestMapping("/board/*") //localhost:port/board/*~~~~
public class BoardController {

	@Inject
	private BoardService service;
	
	@RequestMapping(value="/register", method = RequestMethod.GET) //localhost:port/board/register
	public String registerGET(BoardVO board, Model model) throws Exception {
		System.out.println("Register (GET) Called");
		return "/board/register2"; // /board/register.jsp
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST) //localhost:port/board/register
	public String registerPOST(BoardVO board, Model model) throws Exception {
		System.out.println("Register (POST) Called");
		System.out.println("���� : " + board.getTitle());
		System.out.println("���� : " + board.getContent());
		System.out.println("�۾��� : " + board.getWriter());
		service.regist(board);
		return "home"; // /board/register.jsp
	}
}

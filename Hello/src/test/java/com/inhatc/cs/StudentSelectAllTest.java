package com.inhatc.cs;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.StudentVO;
import com.inhatc.persistence.StudentInfoDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class StudentSelectAllTest {
	
	@Inject
	private StudentInfoDAO dao;
	
	@Test
	public void selectAll() throws Exception {
		List<StudentVO> list = dao.selectAll();
		
		for(StudentVO vo : list) {
			System.out.println(vo.getNo());
			System.out.println(vo.getName());
			System.out.println(vo.getCode());
			System.out.println(vo.getAddr());
			System.out.println(vo.getPhone());
			System.out.println(vo.getEmail());
		}
	}
}

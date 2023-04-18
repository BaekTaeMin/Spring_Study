package com.inhatc.cs;

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
public class StudentInsertTest {

		@Inject
		private StudentInfoDAO dao;
		
		@Test
		public void insert() throws Exception{
			StudentVO vo = new StudentVO();
			vo.setNo("201944009");
			vo.setName("¹éÅÂ¹Î");
			vo.setAddr("°æ±âµµ ±¤¸í");
			vo.setPhone("0108736874");
			vo.setEmail("sween45@naver.com");
			dao.insertStudent(vo);
		}
}

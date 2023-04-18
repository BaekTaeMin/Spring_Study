package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.StudentVO;

public interface StudentInfoDAO {
	
	public StudentVO select(String No) throws Exception;
	
	public void insertStudent(StudentVO vo) throws Exception;
	
	public void update(StudentVO vo) throws Exception;
	
	public void delete(String No) throws Exception;
	
	public List<StudentVO> selectAll() throws Exception;
}

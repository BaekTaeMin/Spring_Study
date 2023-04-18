package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.StudentVO;

@Repository
public class StudentInfoDAOImpl implements StudentInfoDAO{
	
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.inhatc.mapper.StudentInfoMapper";	
	
	@Override
	public StudentVO select(String No) throws Exception {
		return sqlSession.selectOne(namespace + ".select", No);	}
	
	@Override
	public void insertStudent(StudentVO vo) throws Exception {
		sqlSession.insert(namespace + ".insertStudent", vo);	}
	
	@Override
	public void update(StudentVO vo) throws Exception {
		sqlSession.update(namespace + ".update", vo);}
	
	@Override
	public void delete(String No) throws Exception { 
		sqlSession.delete(namespace + ".delete", No);	}
	
	@Override
	public List<StudentVO> selectAll() throws Exception {
		return sqlSession.selectList(namespace + ".selectAll");}
}

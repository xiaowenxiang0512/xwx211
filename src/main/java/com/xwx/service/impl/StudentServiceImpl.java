package com.xwx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xwx.dao.StudentMapper;
import com.xwx.entity.Student;
import com.xwx.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentMapper mapper;

	@Override
	public List<Student> getList() {
		// TODO Auto-generated method stub
		return mapper.getList();
	}
	
	
}

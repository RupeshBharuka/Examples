package com.agile.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agile.Dao.StudentDAO;
import com.agile.Service.StudentService;
import com.agile.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDAO studentDao;
	
	public void addStudentRecord(Student student) {
		studentDao.addStudentRecord(student);
	}

}

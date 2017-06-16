package com.agile.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.agile.Dao.StudentDAO;
import com.agile.model.Student;

@Repository
public class StudentDaoImpl implements StudentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addStudentRecord(Student student) {
		System.out.println("start the dao layer");
		Session session = sessionFactory.openSession();
		session.save(student);
		System.out.println("end dao layer");
		session.beginTransaction().commit();
	}

}

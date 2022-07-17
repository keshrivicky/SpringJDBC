package com.database.SpringJDBC.SpringJDBC.DAO;

import java.util.List;

import com.database.SpringJDBC.SpringJDBC.Student;

public interface StudentDAO {
	
	public int insert(Student student);
	
	public String update(Student student);
	
	public Student getById(int StudentID);
	
	public List<Student> getAllStudent();
	
	public void delete(int StudentID);

}

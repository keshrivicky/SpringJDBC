package com.database.SpringJDBC.SpringJDBC.Annotation;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.database.SpringJDBC.SpringJDBC.Student;
import com.database.SpringJDBC.SpringJDBC.DAO.StudentDAOIMPL;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		StudentDAOIMPL studentDAOIMPL = context.getBean("studentDAOIMPL", StudentDAOIMPL.class);

		Student student = new Student();
		student.setStudentId(9);
		student.setStudentName("abhishek");
		student.setAddress("NOIDA");
		
		//int result = studentDAOIMPL.insert(student);
		
		//System.out.println("Insert SuccessFully !!" + result);
		
		student.setAddress("Banglore");
		String result = studentDAOIMPL.update(student);
		System.out.println("update SuucessFully !!"+ result);
		
		//getById
		Student student1 = studentDAOIMPL.getById(5);
		System.out.println(student1);
		
		studentDAOIMPL.delete(7);
		
		//getAllStudentdata
		List<Student> allStudent  = studentDAOIMPL.getAllStudent();
		for(Student std:allStudent) {
			System.out.println(std);
		}
		
		
	
		
		
		
		
	}

}

package com.database.SpringJDBC.SpringJDBC;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.database.SpringJDBC.SpringJDBC.DAO.StudentDAOIMPL;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/database/SpringJDBC/SpringJDBC/ApplicationContext.xml");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Id ");
		String id1 = sc.nextLine();
		int id  = Integer.parseInt(id1);
		System.out.println("Enter Your name ");
		String name = sc.nextLine();
		System.out.println("Enter Your Address ");
		String city = sc.nextLine();
		
		
		StudentDAOIMPL studentDAOIMPL = context.getBean("StudentDAOImpl",StudentDAOIMPL.class);
		
		Student student =new Student();
		student.setStudentId(id);
		student.setStudentName(name);
		student.setAddress(city);
		
		int result = studentDAOIMPL.insert(student);
		System.out.println("insert Successfully !!" + result);
		//Student s =  studentDAOIMPL.getById(1);
		
		List<Student> students = studentDAOIMPL.getAllStudent();
		
		// studentDAOIMPL.delete(7);
		System.out.println(students);
		
		//studentDAOIMPL.create();
		
		
		
		
	}

}

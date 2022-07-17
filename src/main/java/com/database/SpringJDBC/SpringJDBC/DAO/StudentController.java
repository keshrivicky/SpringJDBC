package com.database.SpringJDBC.SpringJDBC.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.database.SpringJDBC.SpringJDBC.Annotation.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentDAOIMPL studentDAOIMPL;
	
	@RequestMapping("{/id}")
	public com.database.SpringJDBC.SpringJDBC.Student getStudent(@PathVariable("id") int id ) {
		com.database.SpringJDBC.SpringJDBC.Student student =  studentDAOIMPL.getById(id);
		return student;
	}
	

}

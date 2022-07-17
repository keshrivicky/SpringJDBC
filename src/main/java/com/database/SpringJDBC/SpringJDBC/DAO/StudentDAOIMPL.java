package com.database.SpringJDBC.SpringJDBC.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.database.SpringJDBC.SpringJDBC.Student;
@Component
public class StudentDAOIMPL implements StudentDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;



	public int insert(Student student) {
		
		String query = "INSERT INTO `student` (`student_id`, `student_name`, `address`) "
				+ "VALUES (?,?,?);";
		
		int result = this.jdbcTemplate.update(query,student.getStudentId(),student.getStudentName(),student.getAddress());
		return result;
	}

	public String update(Student student) {
		String query="UPDATE `project1`.`student` set student_name =?,address = ? where student_id = ?";
		int result =this.jdbcTemplate.update(query,student.getStudentName(),student.getAddress(),student.getStudentId());
		return ""+result;
	}

	public Student getById(int StudentID) {
		String query = "SELECT * FROM `project1`.`student` where student_id = ?";
		Student student= this.jdbcTemplate.queryForObject(query,new RowMapperImpl(),StudentID);
		return student;
	}

	public List<Student> getAllStudent() {
		String query = "SELECT * FROM `project1`.`student`";
		List<Student> students= (List<Student>) this.jdbcTemplate.query(query,new RowMapperImpl());
		return students;
	}

	public void delete(int StudentID) {
		String query = "DELETE FROM `project1`.`student`  where student_id = ?";
		this.jdbcTemplate.update(query,StudentID);

	}
	
	public void create() {
		String query = "create table Student1(stdId int primary key,studName VARCHAR(30) not null) ";
		this.jdbcTemplate.update(query);
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}

package com.database.SpringJDBC.SpringJDBC.Annotation;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.database.SpringJDBC.SpringJDBC.DAO.StudentDAOIMPL;

@Configuration
@ComponentScan(basePackages = "com.database.SpringJDBC.SpringJDBC.DAO")
public class JavaConfig {
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDatasource());
		return jdbcTemplate;
	}
	
	@Bean
	public DataSource getDatasource() {
		DriverManagerDataSource driver =new DriverManagerDataSource();
		driver.setDriverClassName("com.mysql.jdbc.Driver");
		driver.setUrl("jdbc:mysql://localhost:3306/project1");
		driver.setUsername("root");
		driver.setPassword("password");
		return driver;
	}
	
	/*
	 * @Bean public StudentDAOIMPL getStudentDAOImpl() { StudentDAOIMPL
	 * studentDAOIMPL = new StudentDAOIMPL();
	 * studentDAOIMPL.setJdbcTemplate(getJdbcTemplate()); return studentDAOIMPL; }
	 */

}

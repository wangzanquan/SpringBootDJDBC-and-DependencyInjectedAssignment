package com.example.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public class EmployeeRepository {
	
	@Autowired
	JdbcTemplate jdbc;
	
	public List<Employee> findAll(){
		return jdbc.query("SELECT * FROM EMPLOYEE", new BeanPropertyRowMapper(Employee.class));
	}
	
	/*
	 * Question:
	 * 1. Why Object[] {id}, what is this
	 * 2. Why casting
	 */
	public Employee findOne(int id) {
		return (Employee) jdbc.queryForObject("SELECT * FROM EMPLOYEE WHERE id=?", new Object[] { id }, new BeanPropertyRowMapper<>(Employee.class));
	}
	
	public int deleteOne(int id) {
		return jdbc.update("DELETE FROM EMPLOYEE WHERE id=?", new Object[] {id});
	}
	
	/*
	 * Why the return type is Object but not Employee?
	 */
	public Object addOne(Employee emp) {
		return jdbc.update("INSERT INTO employee(id,fname,lname,address" + "values(?,?,?,?)", new Object[] {emp.getId(), emp.getfName(), emp.getlName(), emp.getAddress()});
	}
	
	//Question: the new Object[] meaning
	public int UpdateOne(Employee emp) {
		return jdbc.update("UPDATE EMPLOYEE" + " SET fname = ?, SET lname = ?, SET address = ?" + " where id =?", new Object[] {emp.getfName(), emp.getlName(), emp.getAddress(), emp.getId()});
	}
	
	//Inner class
	class EmployeeRowMapper implements RowMapper<Employee>{

		@Override
		public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
			Employee emp = new Employee();
			emp.setId(rs.getInt("id"));
			emp.setfName(rs.getString("first name"));
			emp.setlName(rs.getString("last name"));
			emp.setAddress(rs.getString("address"));
			
			return emp;
		}
		
	}
		
	
	
}

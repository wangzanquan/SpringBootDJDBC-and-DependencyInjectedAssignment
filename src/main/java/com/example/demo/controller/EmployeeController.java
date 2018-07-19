package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;



@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository repo;

	@RequestMapping(method = RequestMethod.GET, value = "/employees")
	public List<Employee> getAll() {
		return repo.findAll();

	}

	@RequestMapping(method = RequestMethod.GET, value = "/employees/{id}")
	public Employee getOne(@PathVariable int id) {
		return repo.findOne(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	public Object addOne(@RequestBody Employee emp) {
		return repo.addOne(emp);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
	public int deleteOne(@RequestBody Employee emp, @PathVariable int id) {
		return repo.UpdateOne(emp);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
	public int deleteOne(@PathVariable int id) {
		return repo.deleteOne(id);
	}

}


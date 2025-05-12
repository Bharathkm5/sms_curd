package com.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.entity.Student;
import com.sms.rep.StudentRep;

@Service

public class StudentService {
	@Autowired
	private StudentRep sr;
	
	public List<Student> get_stu(){
		return sr.findAll();
	}
	
	public String save_stu(Student s) {
		sr.save(s);
		return "Data saved successfully";
	}
	
	public String del(Long id) {
		sr.deleteById(id);
		return "Data Delelated Successfully!!";
	}
	
	public Optional<Student>get_tus(Long id){
		return sr.findById(id);
	}
	
	public String edit_stu(Long id,Student s) {
		s.setId(id);
		sr.save(s);
		return "Data updated successfully";
		
	}
	
}

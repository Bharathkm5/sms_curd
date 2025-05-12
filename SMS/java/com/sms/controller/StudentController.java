package com.sms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entity.Student;
import com.sms.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService ss;
	@GetMapping("/view")
	public List<Student> view(){
		return ss.get_stu();
		
	}
	@PostMapping("/save")
	public String save(@RequestBody Student s) {
		return ss.save_stu(s);
	}
	
	@DeleteMapping("del/{id}")
	public String del(@PathVariable Long id) {
		ss.del(id);
		return "Data Delelated Successfully!!";
	}
	
	@GetMapping("stu/{id}")
	public Optional<Student>get_tus(@PathVariable Long id){
		return ss.get_tus(id);
		
	}
	@PutMapping("/update/{id}")
	public String edit_stu(@PathVariable Long id,@RequestBody Student s) {
		return ss.edit_stu(id, s);
	}

}

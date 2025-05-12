package com.sms.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.entity.Student;

@Repository
public interface StudentRep extends JpaRepository<Student, Long>{

	
	
}

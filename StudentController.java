package com.example.demo.controller;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")

public class StudentController {
	@Autowired
	private StudentService service;
	
	  @PostMapping("/save")
		public Student save(@RequestBody Student stu)
		{
			Student a=service.save(stu);
			return a;
		}
	  @GetMapping(value="get/{stuId}")
	    public Student getStudentBystuId(@PathVariable int  stuId)
	    {Student e=service.getStudentBystuId(stuId);
		
		return e;
	    
	    }		
	   @PutMapping("/update")
	   public Student updateStudent(@RequestBody Student stu){
	       Student  updatedstu = service.updateStudent(stu);
	       return updatedstu;
}
	   @DeleteMapping("/delete/{stuId}")
	    public Student deleteEmp(@PathVariable int stuId){
	        Student stList = service.deleteStudentBystuId(stuId);
	        return stList;
	    }
}

package com.classroom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classroom.model.Subject;
import com.classroom.service.SubjectService;

@RestController
@CrossOrigin("*")
@RequestMapping("/subject")
public class SubjectController {

	@Autowired
	private SubjectService subjectService;

	@PostMapping("/add")
	public ResponseEntity<Subject> saveSubject(@Validated @RequestBody Subject subject) {
		System.out.println(subject);
		return new ResponseEntity<Subject>(subjectService.addSubjects(subject), HttpStatus.CREATED);
	}

	@GetMapping("/getsubjects")
	public List<Subject> getAllSubjects() {
		System.out.println("get all  users");
		return subjectService.getAllSubjects();
	}

	@GetMapping("/byid/{id}")
	public ResponseEntity<Subject> getSubjectsById(@PathVariable int id) {
		return new ResponseEntity<>(subjectService.getSubjectById(id).get(), HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Subject> getSubjectsById(@PathVariable int id,
			@Validated @RequestBody Subject updatedSubject) {
		updatedSubject.setSid(id);
		return new ResponseEntity<>(subjectService.addSubjects(updatedSubject), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable int id) {
		subjectService.removeSubject(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
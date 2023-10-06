package com.classroom.service;

import java.util.List;
import java.util.Optional;

import com.classroom.model.Subject;

public interface SubjectService {

	Subject addSubjects(Subject subject);

	List<Subject> getAllSubjects();

	Optional<Subject> getSubjectById(int id);

	Subject updateSubject(int id, Subject subject);

	void removeSubject(int id);

}

package com.classroom.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classroom.model.Subject;
import com.classroom.repositiory.SubjectRepo;
import com.classroom.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectRepo subjectRepo;

	@Override
	public Subject addSubjects(Subject subject) {
		// TODO Auto-generated method stub
		return subjectRepo.save(subject);
	}

	@Override
	public List<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		return subjectRepo.findAll();
	}

	@Override
	public Optional<Subject> getSubjectById(int id) {
		// TODO Auto-generated method stub
		return subjectRepo.findById(id);
	}

	@Override
	public Subject updateSubject(int id, Subject subject) {
		// TODO Auto-generated method stub
		return subjectRepo.save(subject);
	}

	@Override
	public void removeSubject(int id) {
		subjectRepo.delete(getSubjectById(id).get());
	}

}

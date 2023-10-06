package com.classroom.repositiory;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.classroom.model.Subject;

public interface SubjectRepo extends JpaRepository<Subject,Integer>{
// public List<Subject> findBySubjectName(String s);     
}

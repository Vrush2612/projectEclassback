package com.classroom.model;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Subject")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	@Column(unique = true)
	private String sname;
	@Column(unique = true)
	private String scode;
	// @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@OneToOne
//	private Notes note;
	 @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
	 @JsonIgnore
	 private Set<Quiz> quizzes = new LinkedHashSet<>();
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	public Set<Quiz> getQuizzes() {
		return quizzes;
	}
	public void setQuizzes(Set<Quiz> quizzes) {
		this.quizzes = quizzes;
	}

}

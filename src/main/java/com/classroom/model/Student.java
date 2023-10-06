package com.classroom.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentAtt")
public class Student {

	private int id;
	@Id
	private String firstName;
	private String lastName;
	private String eMail;
	// private Address address;
	private String mobileNo;
	private String userName;
	private String password;

}

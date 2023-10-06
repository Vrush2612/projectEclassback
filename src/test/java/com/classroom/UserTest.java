package com.classroom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.classroom.model.User;
import com.classroom.service.UserService;
@SpringBootTest

class UserTest {
	@Autowired
	private UserService userservice;
 static User user;
	@BeforeAll//before all test case
	static void setUpBeforeClass() throws Exception {
		user=new User();
		user.setFirstName("nila");
		user.setLastName("patil");
		user.seteMail("java@gmail.com");
		user.setMobileNo("8596324581");
		user.setState("maharastrat");
		user.setCity("pune");
		user.setCountry("india");
		user.setPassword("Java@123");
		user.setEnabled(true);
		user.setUsername("java");
		user.setRole("student");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
@Disabled
	@Test
	void test() {
		//fail("Not yet implemented");
		assertNotNull(userservice.registerUser(user));
		
	}
@Disabled
	@Test
	void testGetAllStudent() {
		//fail("Not yet implemented");
		assertNotNull(userservice.getAllStudents());
	}
@Disabled
	@Test
	void testGetAllTeacher() {
		//fail("Not yet implemented");
		assertNotNull(userservice.getAllTeachers());
	}
	@Test
	void testGetUserById() {
		//fail("Not yet implemented");
		assertNotNull(userservice.getUserById(2));
	}
	@Disabled
	@Test
	void testupdateUser() {
		assertNotNull(userservice.updateUser(user));
	}
	@Disabled
	@Test
	void testdeleteUser() {
		assertNotNull(userservice.deleteUser(4));
	}
@Disabled
	@Test
	void testLogineUser() {
		assertNotNull(userservice.loginUser(user));
	}
	
}

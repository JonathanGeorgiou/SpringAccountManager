package com.qa.accountmanager;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
class CreateUserTest {

	@InjectMocks
	private UsersService service;

	@Mock
	private UserRepo repo;

	@Test
	public void myTest() {

		List<Users> u = new ArrayList<>();

		//this.service.createUser(user);
	}


	@Test
	void test() {
		// RandomNumber random = new RandomNumber();
		// boolean isItTrue = (random.c == 'a' || random.c == 'b' || random.c == 'c');
		// boolean firstLetterIsTrue = (random.randNumGen().charAt(0) == 'a'||random.randNumGen().charAt(0) == 'b'
		// 		||random.randNumGen().charAt(0) == 'c');
		
		// assertTrue(isItTrue);
		// assertTrue(firstLetterIsTrue);

		// assertEquals(random.get6DigitRandNum().length(), 7);
		// assertEquals(random.get8DigitRandNum().length(), 9);
		// assertEquals(random.get10DigitRandNum().length(), 11);
	}

}

package com.qa.accountmanager;

//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * CreateUserTest
 */

@RunWith(SpringRunner.class)
public class CreateUserTest {

	@InjectMocks
	private UsersService service;

	@Mock
	private UserRepo repo;

	@Mock
	private RandomNumber randNum;

	@Mock
	private PrizeDraw prizeDraw;

	@Test
	public void createUserTest() {

		Users myUser = new Users("Harris", "Hanley");

		Mockito.when(repo.save(myUser)).thenReturn(myUser);
		assertEquals(myUser, this.service.createUser(myUser));


	}



	
}





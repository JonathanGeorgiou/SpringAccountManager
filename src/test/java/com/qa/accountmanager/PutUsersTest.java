package com.qa.accountmanager;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
public class PutUsersTest {

    @InjectMocks
    private UsersService service;

    @Mock
    private UserRepo repo;

    @Test
    public void getUsersTest() {
    	
    	Users user1 = new Users("Harris", "Hanley");
    	Users user2 = new Users("Liam", "McIvor");
    	
    	List<Users> u = new ArrayList<>();
        u.add(user1);

		Mockito.when(repo.getOne(1L)).thenReturn(user1);
		
		service.updateUser(user2, 1L);

		assertEquals("Liam", u.get(0).getFirstName());
		
    	
    }

}

package com.qa.accountmanager;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * TestingTests
 */
@RunWith(SpringRunner.class)
public class GetUsersTest {

    @InjectMocks
    private UsersService service;

    @Mock
    private UserRepo repo;

    @Test
    public void getUsersTest() {
        List<Users> u = new ArrayList<>();
        u.add(new Users("Jonathan","Georgiou"));
        Mockito.when(repo.findAll()).thenReturn(u);
        assertTrue("Returned no ducks", this.service.readUsers().size()>0);

    }

    
}
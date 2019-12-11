package com.qa.accountmanager;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(UsersController.class)
@AutoConfigureMockMvc

class GetUserIntergrationTest {
	
	@Autowired
	private MockMvc mock;
	
	@MockBean
	private UsersService service;
	
	private ObjectMapper mapper = new ObjectMapper();
	
	@Test
	void getUserTest() throws Exception {
		
		List<Users> users = new ArrayList<>();
		Users u1 = new Users("Chloe", "Adcock");
		users.add(u1);
		
		Mockito.when(this.service.readUsers()).thenReturn(users);
		
		this.mock.perform(
					request(HttpMethod.GET, "/getUsers")
					.accept(MediaType.APPLICATION_JSON)
				).andExpect(status().isOk());

	}

}

package com.qa.accountmanager;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(UsersController.class)
@AutoConfigureMockMvc

public class PostIntegrationTest {
	
	@Autowired
	private MockMvc mock;
	
	@MockBean
	private UsersService service;
	
	private ObjectMapper mapper = new ObjectMapper();


	@Test
	public void testCreateDuck() throws JsonProcessingException, Exception {
		Users u1 = new Users("Barry","Barrington");
		Users u2 = new Users("Barry","Barrington");
		u2.setId(1l);
		
		Mockito.when(this.service.createUser(u1)).thenReturn(u2);

		this.mock.perform(request(HttpMethod.POST, "/createUser")
				.contentType(MediaType.APPLICATION_JSON)
				.content(this.mapper.writeValueAsString(u1))
				.accept(MediaType.APPLICATION_JSON))
			.andExpect(status().is(200));
}
}
package com.qa.accountmanager;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
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

/**
 * UpdateUserIntegrationTest
 */
@RunWith(SpringRunner.class)
@WebMvcTest(UsersController.class)
@AutoConfigureMockMvc
public class UpdateUserIntegrationTest {

    @Autowired
	private MockMvc mock;
    
    @MockBean
	private UsersService service;
    
    private ObjectMapper mapper = new ObjectMapper();

    @Test
	public void testUpdateDuck() {
		
		Users u1 = new Users("Matt","Farrow");
		Users u2 = new Users("Harris","Hanley");
		
		Mockito.when(this.service.updateUser(u1, 1L)).thenReturn(u2);
		
		this.mock.perform(
                request(HttpMethod.POST, "/updateUser")
				.contentType(MediaType.APPLICATION_JSON)
                .content(this.mapper.writeValueAsString(u2))
                .accept(MediaType.APPLICATION_JSON))
			    .andExpect(status().is(200));

    
}
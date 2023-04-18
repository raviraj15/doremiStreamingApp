package com.neosoft.DoReMi.controller;
import com.neosoft.DoReMi.entity.User;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.neosoft.DoReMi.service.UserService;

@WebMvcTest(value=UserController.class)
class UserControllerTest {

	@MockBean
	private UserService service;

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void UserControllerTest() throws Exception
	{
		User user1=new User();
		user1.setId(1);
		user1.setName("ravi");
		user1.setEmail("ravi@gmail.com");
		
		User user2=new User();
		user2.setId(2);
		user2.setName("raj");
		user2.setEmail("raj@gmail.com");
		
		List<User> list=new ArrayList<>();
		list.add(user2);
		list.add(user1);
		
		//for getAllUsers url
		when(service.getAllUsers()).thenReturn(list);
		MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/users/getAllPlans");
		ResultActions perform = mockMvc.perform(mockHttpServletRequestBuilder);
		MvcResult andReturn = perform.andReturn();
		MockHttpServletResponse response = andReturn.getResponse();
		int status = response.getStatus();
		assertEquals(200, status);
		
		//for getUserById
		when(service.getUserById(1)).thenReturn(user1);
		MockHttpServletRequestBuilder mockHttpServletRequestBuilder2 = MockMvcRequestBuilders.get("/users/1");
		ResultActions perform2 = mockMvc.perform(mockHttpServletRequestBuilder2);
		MvcResult andReturn2 = perform2.andReturn();
		MockHttpServletResponse response2 = andReturn2.getResponse();
		int status2 = response2.getStatus();
		assertEquals(200, status2);
		
	
	
	}
	@Test
	public void saveUserTest() throws Exception
	{
		User user1=new User();
		user1.setId(1);
		user1.setName("ravi");
		user1.setEmail("ravi@gmail.com");
		//for saving user
		when(service.saveUser(user1)).thenReturn(user1);
		MockHttpServletRequestBuilder post = MockMvcRequestBuilders.post("/users/saveUser");
		ResultActions perform3 = mockMvc.perform(post);
		MvcResult andReturn3 = perform3.andReturn();
		MockHttpServletResponse response3 = andReturn3.getResponse();
		int status3 = response3.getStatus();
		
		assertEquals(201, status3);
	}
	
	
}














package com.theironyard;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.theironyard.entities.HappyHour;
import com.theironyard.services.HappyHourRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.context.WebApplicationContext;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HappyHoursAnonymousApplication.class)
@WebAppConfiguration

public class HappyHoursAnonymousApplicationTests {

//	@Test
//	public void contextLoads() {
//	}

	@Autowired
	HappyHourRepository happyHours;

	@Autowired
	WebApplicationContext wap;

	MockMvc mockMvc;

	@Before
	public void before() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wap).build();
	}

	//addHappyHour
	@Test
	public void testA() throws Exception {
		HappyHour happyHour = new HappyHour();
		happyHour.setAddress("17 princess st");
		happyHour.setName("Iron Yard");
		happyHour.setCity("charleston");
		happyHour.setPhone("3104528686");
		happyHour.setEndTime("six");
		happyHour.setStartTime("four");
		happyHour.setOnMonday(false);
		happyHour.setOnTuesday(false);
		happyHour.setOnWednesday(true);
		happyHour.setOnThursday(true);
		happyHour.setOnFriday(true);
		happyHour.setOnSaturday(false);
		happyHour.setOnSunday(false);
		happyHour.setImage("img");
		happyHour.setSpecials("beer and chips");

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(happyHour);

		mockMvc.perform(
				MockMvcRequestBuilders.post("/happy_hour")
				.content(json)
				.contentType("application/json")
		);

		Assert.assertTrue(happyHours.count() == 1);
	}


////findAll GET
//	@Test
//	public void testAa() throws Exception {
//		MvcResult result = mockMvc.perform(
//				MockMvcRequestBuilders.get("/happy_hour")
//		).andReturn();
//		MockHttpServletResponse response = result.getResponse();
//		String responseStr = response.getContentAsString();
//		ObjectMapper mapper = new ObjectMapper();
//		ArrayList responseArray = mapper.readValue(responseStr, ArrayList.class);
//		Assert.assertTrue(responseArray.size() > 0);
//	}



	//updateHappyHour
	@Test
	public void testB() throws Exception {
		HappyHour happyHour = new HappyHour();
		happyHour.setId(1);
		happyHour.setAddress("17 princess st");
		happyHour.setName("Iron Yard");
		happyHour.setCity("charleston");
		happyHour.setPhone("3104528686");
		happyHour.setEndTime("seven");
		happyHour.setStartTime("four");
		happyHour.setOnFriday(true);
		happyHour.setImage("img");
		happyHour.setSpecials("beer and chips");

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(happyHour);


		mockMvc.perform(
				MockMvcRequestBuilders.put("/happy_hour")
				.content(json)
				.contentType("application/json")
		);

		Assert.assertTrue(happyHours.findOne(1).getEndTime().equals("seven"));
	}
//
//



	//searchByCity
	@Test
	public void testC() {
		HappyHour happyHour = new HappyHour();
		happyHour.setAddress("17 princess st");
		happyHour.setName("Iron Yard");
		happyHour.setCity("charleston");
		happyHour.setPhone("3104528686");
		happyHour.setEndTime("six");
		happyHour.setStartTime("four");
		happyHour.setOnFriday(true);
		happyHour.setImage("img");
		happyHour.setSpecials("beer and chips");
		happyHours.save(happyHour);
		happyHours.save(new HappyHour("Rich's", "5 princess st", "atlanta", "55", "8", "7", true, false, false, false, false, false, false, "beer and chips", "img"));
		happyHours.save(new HappyHour("Bob's", "5 princess st", "atlanta", "55", "8", "7", true, false, false, false, false, false, false, "beer and chips", "img"));

		Assert.assertTrue(happyHours.findByCity("charleston").size() == 2);
	}


	//searchByName
	@Test
	public void testD() {
		Assert.assertTrue(happyHours.findByName("Rich's").size() == 1);
	}

	//deleteHappyHour
	@Test
	public void testE() throws Exception {
		mockMvc.perform(
				MockMvcRequestBuilders.delete("/happy_hour/1")
		);
		Assert.assertTrue(happyHours.count() == 3);
	}


}

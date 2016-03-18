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
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HappyHoursAnonymousApplication.class)
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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
		happyHour.setSpecials(new ArrayList<String>(Arrays.asList("beer", "chips")));

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(happyHour);

		mockMvc.perform(
				MockMvcRequestBuilders.post("/happy_hour")
				.content(json)
				.contentType("application/json")
		);

		Assert.assertTrue(happyHours.count() == 1);
	}

//	@Test
//	public void getHappyHour() throws Exception {
//		List<HappyHour> testList = new List<HappyHour>();
//		mockMvc.perform(
//				MockMvcRequestBuilders.get("/happy_hour")
//
//		);
//	}



	//updateHappyHour
	@Test
	public void testB() throws Exception {
		HappyHour happyHour = happyHours.findOne(1);
		happyHour.setAddress("17 princess st");
		happyHour.setName("Iron Yard");
		happyHour.setCity("charleston");
		happyHour.setEndTime("seven");
		happyHour.setStartTime("four");
		happyHour.setOnFriday(true);
		happyHour.setImage("img");
		happyHour.setSpecials(new ArrayList<String>(Arrays.asList("beer", "chips")));

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(happyHour);


		mockMvc.perform(
				MockMvcRequestBuilders.put("/happy_hour/1")
				.content(json)
				.contentType("application/json")
		);

		Assert.assertTrue(happyHours.findOne(1).getEndTime().equals("seven"));
	}
//
//


//	@Test
//	public void searchByCity() {
//		HappyHour happyHour = new HappyHour();
//		happyHour.setAddress("17 princess st");
//		happyHour.setName("Iron Yard");
//		happyHour.setCity("charleston");
//		happyHour.setEndTime("six");
//		happyHour.setStartTime("four");
//		happyHour.setOnFriday(true);
//		happyHour.setImage("img");
//		happyHour.setSpecials(new ArrayList<String>(Arrays.asList("beer", "chips")));
//		public List<HappyHour> searchByCity(@PathVariable"charleston", String city)
//	}

	//deleteHappyHour
	@Test
	public void testC() throws Exception {
		mockMvc.perform(
				MockMvcRequestBuilders.delete("/happy_hour/1")
		);
		Assert.assertTrue(happyHours.count() == 0);
	}


}

package com.homefooddelivery.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.homefooddelivery.HomeFoodDeliveryApplication;
import com.jayway.restassured.RestAssured;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HomeFoodDeliveryApplication.class)
@WebAppConfiguration
@IntegrationTest("server.port:0")
public class IndexControllerTest {

	@Test
	public void testValid() {
		//RestAssured.when().get("/").then().statusCode(200);
	}
	
	@Test
	public void testNotValid() {
		//RestAssured.when().get("/bad").then().statusCode(200);
	}
}

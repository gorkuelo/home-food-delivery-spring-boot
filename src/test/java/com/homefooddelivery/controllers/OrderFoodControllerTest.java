package com.homefooddelivery.controllers;

import static org.junit.Assert.*;

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
public class OrderFoodControllerTest {

	@Test
	public void testBadRequest() {
		RestAssured.when().get("/orderHomeFood").then().statusCode(400);
	}

	@Test
	public void testNotValid() {
		RestAssured.when().get("/bad").then().statusCode(404);
	}
	
	@Test
	public void testValid() {
		RestAssured.when().get("/orderHomeFood?orders=product_1number_2product_5number_0product_8number_33").
		then().statusCode(200);
	}
	
	
}

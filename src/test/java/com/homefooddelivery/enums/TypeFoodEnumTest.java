package com.homefooddelivery.enums;

import static org.junit.Assert.*;

import org.junit.Test;

public class TypeFoodEnumTest {

	@Test
	public void testValid() {
		assertEquals("principal",TypeFoodEnum.PRINCIPAL.type());
		assertEquals("bebida",TypeFoodEnum.BEBIDA.type());
		assertEquals("postre",TypeFoodEnum.POSTRE.type());
	}	
	
	@Test
	public void testNotValid() {
		assertNotEquals("111",TypeFoodEnum.PRINCIPAL.type());
		assertNotEquals("ddd",TypeFoodEnum.BEBIDA.type());
		assertNotEquals("444",TypeFoodEnum.POSTRE.type());
	}

}

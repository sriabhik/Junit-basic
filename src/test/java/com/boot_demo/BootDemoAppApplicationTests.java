package com.boot_demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootDemoAppApplicationTests {

	private Calculator c = new Calculator();
	
	@Test
	void contextLoads() {
	}

	@Test
	void testSum() {
		int expectedResult = 20;
		
		int actualResult = c.doSum(12, 3, 5);
		
		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testProduct() {
		int expectedResult = 60;

		int actualResult = c.doProduct(12, 5);

		assertThat(actualResult).isEqualTo(expectedResult);
	}

	//compare
	@Test
	@Disabled
	void testCompare() {
		boolean expectedResult = true;

		boolean actualResult = c.compareTwoNums(5, 5);

		assertThat(actualResult).isTrue();
	}
}

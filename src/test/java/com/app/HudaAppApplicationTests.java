 package com.app;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.controller.EmpController;


@SpringBootTest
class HudaAppApplicationTests {

	@Autowired
	EmpController emp;
	
	@Test
	void contextLoads() {
	}

	@Test
	void chechAddition() {
		int expectedResult = 30;
		
		int actualResult = emp.addition(10, 20);
		
		assertThat(actualResult).isEqualTo(expectedResult);
		
	}
}

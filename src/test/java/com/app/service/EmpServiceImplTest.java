package com.app.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.stream;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.app.pojos.Dept;
import com.app.pojos.Emp;
import com.app.repo.EmpRepo;

@SpringBootTest
class EmpServiceImplTest {
	@MockBean
	EmpRepo empRepo;
	
	@Autowired
	EmpService empService;
	
	/*
	 * @Test void testGetAll() {
	 * 
	 * when(empRepo.findAll()).thenReturn(Stream.of(new
	 * Emp("Pawan","P@swami","BA","2012","nanded","8800663344",Dept.JAVA), new
	 * Emp("Pooja", "P@Swami", "BE", "2014", "Satara",
	 * "8124154521",Dept.IT)).collect(Collectors.toList()));
	 * 
	 * assertEquals(2, empService.getAll().size());
	 * 
	 * }
	 */

}

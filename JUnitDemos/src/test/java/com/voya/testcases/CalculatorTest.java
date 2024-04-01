package com.voya.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.training.Calculator;

public class CalculatorTest {
	
	Calculator calculator = null;

	@BeforeAll
	static void init() throws Exception {
		System.out.println("Called before all the testcases");
	}

	@AfterAll
	static void cleanup() throws Exception {
		System.out.println("Called after all the testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
		System.out.println("Called before each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
		System.out.println("Called after each testcases");
	}

	@Test
	@DisplayName("Testing sum method")
	void testSum() {
		int actual = calculator.sum(10,20);
		assertEquals(30, actual, "output should br 30");
	}
	
	@Test
	@DisplayName("Testing product method")
	void testProduct() {
		int actual = calculator.product(10,20);
		assertEquals(200, actual, "output should be 200");
	}
	
	@Test
	@DisplayName("Testing Greet method")
	void testGreet() {
		String name = "Nithin";
		String actual = calculator.greetMessage(name);
		assertEquals("Welcome NITHIN", actual, "Output should be Welcome NITHIN");
	}
	
	@Tag("First")
	@Test
	@DisplayName("Testing show Courses method")
//	@Disabled
	void testShowCourses() {
		List<String> expected = Arrays.asList("ANGULAR", "CSS", "HTML", "JAVA", "SPRING");
		
		List<String> coursesInput = Arrays.asList("CSS", "JAVA", "SPRING", "ANGULAR", "HTML");
		List<String> actual = calculator.showCorses(coursesInput);
		assertEquals(expected, actual);
	}

}

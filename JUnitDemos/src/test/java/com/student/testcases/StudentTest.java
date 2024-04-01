package com.student.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.exceptions.InvalidNumException;
import com.voya.training.Student;

class StudentTest {
	
	Student student = null;

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
		student = new Student();
		System.out.println("Called before each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		student = null;
		System.out.println("Called after each testcases");
	}

	@Test
	@DisplayName("Testing positive marks")
	void testTotalMarks() {
		int actual = student.totalMarks(90, 80, 90);
		assertEquals(260, actual, "Output should be 260");
	}
	
//	@Tag("Negative")
//	@Test
//	@DisplayName("Testing negative marks")
//	void testNegativeMarks() {
//		assertThrows(InvalidNumException.class,  () -> student.totalMarks(90, -20, 60));
//	}
	
//	@Test
//	@DisplayName("Testing for marks greater tham 100")
//	void testGreaterMarks() {
//		assertThrows(InvalidNumException.class,  () -> student.totalMarks(190, 20, 60));
//	}

}

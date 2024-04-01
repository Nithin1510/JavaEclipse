package com.voya.testcases.trial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CheckerTest {

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
		System.out.println("Called before each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Called after each testcases");
	}

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	@DisplayName("Testing Null")
	void testNull() {
		List<String> myList = null;
		assertNull(myList);
	}
	
	@Tag("First")
	@Test
	@DisplayName("Testing not Null")
	void testNotNull() {
		List<String> myList = new ArrayList<>();
		assertNotNull(myList);
	}
	
	@Tag("Simple")
	@Test
	@DisplayName("Testing String references")
	void testSame() {
		String uname = "Nithin";
		String nuser = "Nithin";
//		String nuser = new String("Nithin");
		assertSame(uname, nuser);
	}
	
//	@Test
//	@DisplayName("Testing for equality")
//	void testEquality() {
//		String uname = "Nithin";
//		assertEquality(uname, nuser);
//	}

}

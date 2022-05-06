package io.it22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstMavenProjTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test_sum() {
		assertEquals(4, FirstMavenProj.Sum(2, 2));
	}
	
	@Test
	void test_findMax() {
		assertEquals(4, FirstMavenProj.findMax(new int[]{1,3,4,2}));
		assertEquals(4, FirstMavenProj.findMax(new int[] {4,-1,-3,-4,0,2}));
	}

}

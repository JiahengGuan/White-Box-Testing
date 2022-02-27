package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.*;

public class BuggyClassTestSC1a {
	
	BuggyClass myBuggy;
	
	@Before
	public void setUp() {
		myBuggy = new BuggyClass();
	}

	@After
	public void tearDown() {
		myBuggy = null;
	}
	
	@Test
	public void buggyMethod1() {
		assertEquals(0,myBuggy.buggyMethod1(0, 2));
		assertEquals(3,myBuggy.buggyMethod1(2, 1));
		assertEquals(4,myBuggy.buggyMethod1(2, 2));
	}
}

package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BuggyClassTestSC1b {

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
	public void test() {
		assertEquals(0,myBuggy.buggyMethod1(-1, 0));
	}
}

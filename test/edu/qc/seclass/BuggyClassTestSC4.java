package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BuggyClassTestSC4 {

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
	public void buggyMethod4() {
		assertEquals(2,myBuggy.buggyMethod4(2, 1));
		assertEquals(-1,myBuggy.buggyMethod4(-2, 2));
		assertEquals(1,myBuggy.buggyMethod4(-2, -2));
		assertEquals(0,myBuggy.buggyMethod4(0, 0));
	}

}

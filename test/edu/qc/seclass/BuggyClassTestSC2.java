package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BuggyClassTestSC2 {

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
	public void buggyMethod2() {
		assertEquals(1,myBuggy.buggyMethod2(-1, 2));
		assertEquals(2,myBuggy.buggyMethod2(2, 1));
		assertEquals(2,myBuggy.buggyMethod2(0, 2));
	}

}

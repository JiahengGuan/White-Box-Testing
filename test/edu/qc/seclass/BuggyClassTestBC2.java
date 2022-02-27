package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BuggyClassTestBC2 {

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
		assertEquals(3,myBuggy.buggyMethod2(1, 2));
		assertEquals(0,myBuggy.buggyMethod2(3, 0));
	}
}

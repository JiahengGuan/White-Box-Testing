package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BuggyClassTestSC3 {

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
	public void buggyMethod3() {
		assertEquals(-1,myBuggy.buggyMethod3(-1, 2));
		assertEquals(3,myBuggy.buggyMethod3(1, 3));
		assertEquals(0,myBuggy.buggyMethod3(0, 3));
	}

}

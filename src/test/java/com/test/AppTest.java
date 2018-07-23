package com.test;

import org.junit.Test;
import static org.junit.Assert.*;


public class AppTest {

	@Test
	public void testConcatenate() {
		App myApp = new App();
		
		String result = myApp.concatenate("one", "two");
		
		assertEquals("onetwo", result);
	}

}

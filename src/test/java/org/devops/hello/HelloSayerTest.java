package org.devops.hello;

import junit.framework.TestCase;

public class HelloSayerTest extends TestCase {

	
	public void testSayHello() {
		String hello = new HelloSayer().sayHello("Mama");
		assertEquals("Hello Mama", hello);
	}
	
}

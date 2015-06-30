package org.devops.hello;

import junit.framework.TestCase;

import org.junit.Test;

public class HelloSayerTest extends TestCase {

	@Test
	public void testSayHello() {
		String hello = new HelloSayer().sayHello("Mama");
		assertEquals("Hello Mama", hello);
	}
	
}

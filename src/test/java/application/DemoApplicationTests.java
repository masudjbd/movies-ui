package application;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void exampleTest() {
		String body = "Hello World";
		assertEquals(body,"Hello World");
	}


	@Test
	public void exampleTest2() {
		String body = "Holla World";
		assertEquals(body,"Holla World");
	}

	@Test
	public void exampleTest3() {
		String body = "Como Estas";
		assertEquals(10,body.length());
	}
}

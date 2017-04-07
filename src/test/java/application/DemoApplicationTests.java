package application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
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

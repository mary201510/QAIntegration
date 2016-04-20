package welab.test.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import welab.test.test.HelloWorld;

public class HelloWorldTest {

	@Test
	public void testTetsMethod1() {
		
		HelloWorld hw = new HelloWorld();
		String s=hw.tetsMethod1();
		assertNotNull(s);
	}

	@Test
	public void testAddMethod() {
		HelloWorld hw = new HelloWorld();
		int i=hw.addMethod(2, 3);
		assertEquals(5,i);
	}

}

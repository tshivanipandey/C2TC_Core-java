package myjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class FirstJunitTestPro {

	@Test
	void test() {
		
		System.out.println("Heloo");
	}
	
	@Test
	void test1() {
		
		System.out.println("Heloo");
	}
	
	@Test
	void simple()
	{
		int a=1;
		int b=2;
		assertEquals(a, b);
	}
	
	@Test
	void simple1()
	{
		int a=1;
		int b=1;
		assertEquals(a, b);
	}
	
	@Test
	void testOnDev()
	{
		System.setProperty("DEV", "ENV");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
	}

}

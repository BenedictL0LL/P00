import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testadd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		
		int expected = 9999;
		assertEquals (expected,actual);
		
		
	}
	@Test
	public void testsubtract() {
		//fail("Not yet implemented");
		int a = 1235;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected = 1;
		assertEquals (expected,actual);
	}
	@Test
	public void testmultiply() {
		//fail("Not yet implemented");
		int a = 1;
		int b = 5;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a,b);
		int expected = 5;
		assertEquals (expected,actual);
	}
	@Test
	public void testdivide() {
		//fail("Not yet implemented");
		int a = 10;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		
		int expected = 5;
		assertEquals (expected,actual);
	}
}

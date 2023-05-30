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

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {

		//Arrange
		int a = 4321;
		int b = 1234;

		Calculator cal = new Calculator();

		//Act
		int actual = cal.add(a, b); 

		//Assert
		int expected = 5555;
		assertEquals (expected, actual);
	}
	@Test
	public final void testSubtract() {

		//Arrange
		int a = 9876;
		int b = 4321;
		Calculator cal = new Calculator();
		//Act
		int actual = cal.subtract(a, b);

		//Assert
		int expected = 5555;
		assertEquals(actual , expected);
	}

	@Test
	public final void testMultiply() {
		//Arrange
		int a = 1;
		int b = 4;
		Calculator cal = new Calculator();
		//Act
		int actual = cal.multiply(a,b);

		//Assert
		int expected = 4;
		assertEquals(actual,expected);

	}
	@Test
	public final void testDivide() {
		//Arrange
		int a = 6;
		int b = 2;
		Calculator cal = new Calculator();
		//Act
		int actual = cal.divide(a,b);

		//Assert
		int expected = 3;
		assertEquals(actual,expected);
	}


	@After
	public void tearDown() throws Exception {
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}



}

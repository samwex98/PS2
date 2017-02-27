package base;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyIntegerTest {

	@Test
	public void testMyInteger() {
		
	}

	@Test
	public void testGetiValue() {
		int iValue = 0;
		MyInteger val = new MyInteger(iValue);
		assertEquals(val.getiValue(), iValue);
	}

	@Test
	public void testIsEven() {
		MyInteger test = new MyInteger(4);
		boolean expectedbool = true;
		assertEquals(test.isEven(), expectedbool);
		MyInteger test2 = new MyInteger(5);
		expectedbool = false;
		assertEquals(test2.isEven(), expectedbool);
	}

	@Test
	public void testIsOdd() {
		MyInteger test = new MyInteger(5);
		boolean expectedbool = true;
		assertEquals(test.isOdd(), expectedbool);
		MyInteger test2 = new MyInteger(4);
		expectedbool = false;
		assertEquals(test2.isOdd(), expectedbool);
	}

	@Test
	public void testIsPrime() {
		MyInteger test = new MyInteger(6);
		boolean expectedbool = false;
		assertEquals(test.isPrime(), expectedbool);
		MyInteger test2 = new MyInteger(5);
		expectedbool = true;
		assertEquals(test2.isPrime(), expectedbool);
	}

	@Test
	public void testIsEvenInt() {
		MyInteger test = new MyInteger(4);
		boolean expectedbool = true;
		assertEquals(test.isEven(), expectedbool);
		MyInteger test2 = new MyInteger(5);
		expectedbool = false;
		assertEquals(test2.isEven(), expectedbool);
	}

	@Test
	public void testIsOddInt() {
		MyInteger test = new MyInteger(5);
		boolean expectedbool = true;
		assertEquals(test.isOdd(), expectedbool);
		MyInteger test2 = new MyInteger(4);
		expectedbool = false;
		assertEquals(test2.isOdd(), expectedbool);
	}

	@Test
	public void testIsPrimeInt() {
		MyInteger test = new MyInteger(6);
		boolean expectedbool = false;
		assertEquals(test.isPrime(), expectedbool);
		MyInteger test2 = new MyInteger(5);
		expectedbool = true;
		assertEquals(test2.isPrime(), expectedbool);
	}

	@Test
	public void testIsEvenMyInteger() {
		MyInteger test = new MyInteger(4);
		boolean expectedbool = true;
		assertEquals(test.isEven(test), expectedbool);
		MyInteger test2 = new MyInteger(5);
		expectedbool = false;
		assertEquals(test2.isEven(test2), expectedbool);
	}

	@Test
	public void testIsOddMyInteger() {
		MyInteger test = new MyInteger(5);
		boolean expectedbool = true;
		assertEquals(test.isOdd(test), expectedbool);
		MyInteger test2 = new MyInteger(4);
		expectedbool = false;
		assertEquals(test2.isOdd(test2), expectedbool);
	}

	@Test
	public void testIsPrimeMyInteger() {
		MyInteger test = new MyInteger(6);
		boolean expectedbool = false;
		assertEquals(test.isPrime(test), expectedbool);
		MyInteger test2 = new MyInteger(5);
		expectedbool = true;
		assertEquals(test2.isPrime(test2), expectedbool);

	}

}

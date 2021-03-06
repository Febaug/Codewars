package vasyaClerk;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VasyaClerkTest {

	@Test
	public void test1() {
		assertEquals("YES", VasyaClerk.tickets(new int[] { 25, 25, 50 }));
	}

	@Test
	public void test2() {
		assertEquals("NO", VasyaClerk.tickets(new int[] { 25, 100 }));
	}

	@Test
	public void test3() {
		assertEquals("NO", VasyaClerk.tickets(new int[] { 25, 25, 100 }));
	}

	@Test
	public void test4() {
		assertEquals("NO", VasyaClerk.tickets(new int[] { 25, 25, 25, 25, 25, 100, 100 }));
	}
}

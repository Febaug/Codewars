package areSame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AreSameTest {

	@Test
	void test() {
		final int[] a = new int[] { 121, 144, 19, 161, 19, 144, 19, 11 };
		final int[] b = new int[] { 121, 14641, 20736, 361, 25921, 361, 20736, 361 };
		assertEquals(true, AreSame.comp(a, b));
	}

	@Test
	void test2() {
		final int[] a = new int[] { 2, 2, 3 };
		final int[] b = new int[] { 4, 4, 9 };
		assertEquals(true, AreSame.comp(a, b));
	}
}

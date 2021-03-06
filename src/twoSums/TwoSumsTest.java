package twoSums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TwoSumsTest {

	@Test
	public void basicTests() {
		doTest(new int[] { 1, 2, 3 }, new int[] { 0, 2 });
		doTest(new int[] { 1234, 5678, 9012 }, new int[] { 1, 2 });
		doTest(new int[] { 2, 2, 3 }, new int[] { 0, 1 });
	}

	private void doTest(int[] numbers, int[] expected) {
		final int target = numbers[expected[0]] + numbers[expected[1]];
		final int[] actual = TwoSums.twoSum(numbers, target);
		if (null == actual) {
			System.out.format("Received a null\n");
			assertNotNull(actual);
		}
		if (actual.length != 2) {
			System.out.format("Received an array that's not of length 2\n");
			assertTrue(false);
		}
		final int received = numbers[actual[0]] + numbers[actual[1]];
		assertEquals(target, received);
	}
}

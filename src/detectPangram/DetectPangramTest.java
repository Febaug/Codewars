package detectPangram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DetectPangramTest {

	@Test
	public void test1() {
		final String pangram1 = "The quick brown fox jumps over the lazy dog.";
		final DetectPangram pc = new DetectPangram();
		assertEquals(true, pc.check(pangram1));
	}

	@Test
	public void test2() {
		final String pangram2 = "You shall not pass!";
		final DetectPangram pc = new DetectPangram();
		assertEquals(false, pc.check(pangram2));
	}
}

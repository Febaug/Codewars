package disemvowelTrolls;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DisemvowelTrollsTest {

	@Test
	void test() {
		assertEquals("Ths wbst s fr lsrs LL!", DisemvowelTrolls.disemvowel("This website is for losers LOL!"));
		assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
				DisemvowelTrolls.disemvowel("No offense but,\nYour writing is among the worst I've ever read"));
		assertEquals("Wht r y,  cmmnst?", DisemvowelTrolls.disemvowel("What are you, a communist?"));
	}

}

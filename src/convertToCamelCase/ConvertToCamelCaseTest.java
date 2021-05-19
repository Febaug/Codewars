package convertToCamelCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConvertToCamelCaseTest {

	@Test
	public void testSomeUnderscoreLowerStart() {
		final String input = "the_Stealth_Warrior";
		System.out.println("input: " + input);
		assertEquals("theStealthWarrior", ConvertToCamelCase.toCamelCase(input));
	}

	@Test
	public void testSomeDashLowerStart() {
		final String input = "the-Stealth-Warrior";
		System.out.println("input: " + input);
		assertEquals("theStealthWarrior", ConvertToCamelCase.toCamelCase(input));
	}

}

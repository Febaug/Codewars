package directionsReduction;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class DirectionsReductionTest {

	@Test
	void test() {
		assertArrayEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
				new String[] { "WEST" }, DirectionsReduction
						.dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" }));
	}

	@Test
	void test2() {
		assertArrayEquals("\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"", new String[] {},
				DirectionsReduction.dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH" }));
	}
}

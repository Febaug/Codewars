package insaneColourdeTriangles;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class InsaneColouredTrianglesTest {

	@Test
	public void triangleTest() {
		assertEquals('B', InsaneColouredTriangles.triangle("B"));
		assertEquals('R', InsaneColouredTriangles.triangle("GB"));
		assertEquals('R', InsaneColouredTriangles.triangle("RRR"));
		assertEquals('B', InsaneColouredTriangles.triangle("RGBG"));
		assertEquals('G', InsaneColouredTriangles.triangle("RBRGBRB"));
		assertEquals('G', InsaneColouredTriangles.triangle("RBRGBRBGGRRRBGBBBGG"));
	}

}

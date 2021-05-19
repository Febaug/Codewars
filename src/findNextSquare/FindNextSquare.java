package findNextSquare;

public class FindNextSquare {
	public static long findNextSquare(long sq) {
		final double squareRoot = Math.sqrt(sq);

		// has the square root a rest?
		if (squareRoot == (int) squareRoot) {
			final long nextSquare = ((long) squareRoot + 1) * ((long) squareRoot + 1);
			return nextSquare;
		}

		return -1;
	}
}

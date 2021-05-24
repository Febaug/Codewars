package areSame;

public class AreSame {
	public static boolean comp(int[] a, int[] b) {
		if (a == null || b == null || a.length != b.length) {
			return false;
		}

		// True, when both arrays are empty
		if (a.length == 0) {
			return true;
		}

		int square = 0;
		for (int number = 0; number < a.length; number++) {
			square = a[number] * a[number];
			for (int i = 0; i < b.length; i++) {

				// Set the entries to 0 if the square is found
				if (b[i] == square) {
					b[i] = 0;
					a[number] = 0;
					break;
				}
			}
		}

		// Check, if all were found
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0 || b[i] != 0) {
				return false;
			}
		}
		return true;
	}
}

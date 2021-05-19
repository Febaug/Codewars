package tenMinWalk;

public class TenMinWalk {
	public static boolean isValid(char[] walk) {
		int horizontal = 0;
		int vertical = 0;

		// We must walk 10 blocks
		if (walk.length != 10) {
			return false;
		}

		for (final char c : walk) {
			switch (c) {
			case 'n':
				horizontal++;
				break;
			case 's':
				horizontal--;
				break;
			case 'w':
				vertical++;
				break;
			case 'e':
				vertical--;
				break;
			}
		}

		// Return false if we walked to far in one direction
		return vertical == 0 && horizontal == 0;
	}
}

package greedIsGood;

public class GreedIsGood {
	public static int greedy(int[] dice) {
		int sum = 0;
		final int[] occurrences = new int[7];

		// Count the occurrences
		for (final int number : dice) {
			occurrences[number]++;
		}

		// Count triplets
		for (int i = 2; i < 7; i++) {
			if (occurrences[i] == 0) {
				continue;
			} else if (occurrences[i] >= 3) {
				sum += i * 100;
			}
		}

		// Count the occurrences of 1
		if (occurrences[1] >= 3) {
			sum += 1000;
			sum += (occurrences[1] - 3) * 100;
		} else {
			sum += occurrences[1] * 100;
		}

		// Count the occurrences of 5
		if (occurrences[5] >= 3) {
			sum += (occurrences[5] - 3) * 50;
		} else {
			sum += occurrences[5] * 50;
		}
		return sum;
	}
}

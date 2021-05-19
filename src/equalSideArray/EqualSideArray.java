package equalSideArray;

public class EqualSideArray {
	public static int findEvenIndex(int[] arr) {
		int sidesAreEqualIndex = -1;
		final int arrayLength = arr.length;

		long sumLeft = 0;
		long sumRight = 0;
		for (int i = 0; i < arrayLength; i++) {
			sumRight = 0;

			// For the case, that the last number is 0
			sumLeft += i > 0 ? arr[i - 1] : 0;

			// Sum all numbers right from i
			for (int j = arrayLength - 1; j > i; j--) {
				sumRight += arr[j];
			}

			// Save the index if the sums are equal
			if (sumLeft == sumRight) {
				sidesAreEqualIndex = i;
			}
		}
		return sidesAreEqualIndex;
	}
}

package directionsReduction;

public class DirectionsReduction {
	public static String[] dirReduc(String[] arr) {
		String[] newDirections = new String[arr.length];
		int currentIndex = 0;
		boolean hasChange = true;

		while (hasChange && arr.length > 1) {
			hasChange = false;
			currentIndex = 0;

			for (int i = 0; i < arr.length - 1; i++) {
				if (areTheOpposite(arr[i], arr[i + 1])) {
					hasChange = true;
					i++;
					continue;
				}

				newDirections[currentIndex] = arr[i];
				currentIndex++;
			}

			if (arr.length > 1 && !areTheOpposite(arr[arr.length - 2], arr[arr.length - 1]))
				newDirections[currentIndex] = arr[arr.length - 1];

			arr = removeNull(newDirections);
			newDirections = new String[arr.length];
		}

		for (final String s : arr) {
			System.out.print(s + ", ");
		}
		return arr;
	}

	private static boolean areTheOpposite(String firstDirection, String secondDirection) {
		switch (firstDirection) {
		case "SOUTH":
			if (secondDirection.equals("NORTH")) {
				return true;
			}
			break;
		case "NORTH":
			if (secondDirection.equals("SOUTH")) {
				return true;
			}
			break;
		case "EAST":
			if (secondDirection.equals("WEST")) {
				return true;
			}
			break;
		case "WEST":
			if (secondDirection.equals("EAST")) {
				return true;
			}
			break;
		}

		return false;
	}

	private static String[] removeNull(String[] array) {
		String[] nonNullString = new String[array.length];

		// Shrink the size to the amount of non-null elements
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				nonNullString = new String[i];
				break;
			}
		}

		// Add all non-null elements to the new array
		for (int i = 0; i < nonNullString.length; i++) {
			nonNullString[i] = array[i];
		}

		return nonNullString;

	}
}

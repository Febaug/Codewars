package sumDigitsPower;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumDigitsPower {
	public static List<Long> sumDigPow(long a, long b) {
		final List<Long> powerDigits = new ArrayList<>();
		List<Long> digits = new ArrayList<>();
		long sum = 0;

		for (long currentDigit = a; currentDigit <= b; currentDigit++) {
			sum = 0;
			digits = new ArrayList<>();
			long temp = currentDigit;

			// Get the single digits
			while (temp > 0) {
				digits.add(temp % 10);
				temp = temp / 10;
			}

			Collections.reverse(digits);
			// Sum the the digits with the power of its index
			for (int i = 0; i < digits.size(); i++) {
				sum += Math.pow(digits.get(i), i + 1);
			}

			// Equals the sum of the powered digits the current digit?
			if (sum == currentDigit) {
				powerDigits.add(currentDigit);
			}
		}

		return powerDigits;
	}
}

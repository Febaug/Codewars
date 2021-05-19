package vasyaClerk;

import java.util.HashMap;
import java.util.Map;

public class VasyaClerk {
	public static String tickets(int[] peopleInLine) {
		int currentMoney = 0;

		final Map<Integer, Integer> moneyBills = new HashMap<>();
		moneyBills.put(25, 0);
		moneyBills.put(50, 0);
		moneyBills.put(100, 0);

		for (final int i : peopleInLine) {
			System.out.println(i + ", " + moneyBills);
			moneyBills.put(i, moneyBills.get(i) + 1);
			currentMoney = i - 25;

			if (i == 100) {
				// Can we give a 50$ bill?
				if (moneyBills.get(50) > 0) {
					moneyBills.put(50, moneyBills.get(50) - 1);
					currentMoney -= 50;
				}
			}

			// give out enough 25$ bills as change
			while (currentMoney > 0) {
				if (moneyBills.get(25) <= 0 && currentMoney > 0) {
					return "NO";
				}

				moneyBills.put(25, moneyBills.get(25) - 1);
				currentMoney -= 25;
			}
		}

		return "YES";
	}
}

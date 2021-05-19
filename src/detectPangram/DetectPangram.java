package detectPangram;

import java.util.ArrayList;
import java.util.List;

public class DetectPangram {
	public boolean check(String sentence) {
		final List<Character> letter = new ArrayList<>();

		// Remove all non alphabet letters
		sentence = sentence.replaceAll("[^a-zA-Z]", "");
		sentence = sentence.toLowerCase();

		for (final Character c : sentence.toCharArray()) {
			if (!letter.contains(c)) {
				letter.add(c);
			}
		}

		return letter.size() == 26;
	}
}

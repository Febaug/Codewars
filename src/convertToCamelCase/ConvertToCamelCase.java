package convertToCamelCase;

public class ConvertToCamelCase {
	static String toCamelCase(String s) {
		final String[] singleWords = s.split("[-_]");
		String camelCase = singleWords[0];

		String temp;
		for (int i = 1; i < singleWords.length; i++) {
			temp = singleWords[i].substring(0, 1).toUpperCase();
			camelCase += temp + singleWords[i].substring(1);
		}
		return camelCase;
	}
}

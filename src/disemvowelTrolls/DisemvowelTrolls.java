package disemvowelTrolls;

public class DisemvowelTrolls {
	public static String disemvowel(String str) {
		str = str.replaceAll("[aeiouAEIOU]", "");
		return str;
	}

	public static void main(String[] args) {
		System.out.println(disemvowel("This website is for losers LOL!"));
	}
}

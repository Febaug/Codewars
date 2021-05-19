
package insaneColourdeTriangles;

public class InsaneColouredTriangles {
	public static char triangle(String row) {
		String newRow = "";
		String temp;
		int rowLength;

		while (row.length() > 1) {
			rowLength = row.length();
			for (int i = 0; i < rowLength - 1; i++) {
				temp = row.substring(i, i + 2);
				switch (temp) {
				case "GG":
				case "BR":
				case "RB":
					newRow += "G";
					break;
				case "RR":
				case "BG":
				case "GB":
					newRow += "R";
					break;
				default:
					newRow += "B";
				}
			}
			row = newRow;
			newRow = "";
		}
		return row.charAt(0);
	}

	public static void main(String[] args) {
		System.out.println(triangle(
				"RBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGGRBRGBRBGGRRRBGBBBGG"));
	}
}

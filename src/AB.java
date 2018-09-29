// Name - Omar Elamri
// Date - 9/25
// Lab - If & Strings

public class AB {
	public static boolean check(String s, String a, String b) {
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == a.charAt(0)) {
				if (s.charAt(i + 1) == b.charAt(0)) {
					return true;
				}
			}
		}
		return false;
	}
}
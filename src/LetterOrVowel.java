// Name - Omar Elamri
// Date - 9/25
// Lab - If & Strings

public class LetterOrVowel {
	public static boolean check(String s) {
		String checkString = "AEIOUaeiou1234567890";
		return checkString.indexOf(s.charAt(0)) > -1;
	}
}
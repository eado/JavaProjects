// Name - Omar Elamri
// Date - 9/25
// Lab - If & Strings

public class AplusRunner {
	public static void main(String args[]) {
		System.out.println(AB.check("chicken", "a", "b"));
		System.out.println(AB.check("frog", "f", "g"));
		System.out.println(AB.check("chicken", "c", "k"));
		System.out.println(AB.check("apluscompsci", "a", "s"));
		System.out.println(AB.check("apluscompsci", "a", "p"));
		System.out.println(AB.check("apluscompsci", "s", "c"));
		System.out.println(AB.check("apluscompsci", "c", "p"));

		System.out.println("Letter or Vowel");

		System.out.println(LetterOrVowel.check("apluscompsci"));
		System.out.println(LetterOrVowel.check("1forthemoney"));
		System.out.println(LetterOrVowel.check("chicken99"));
		System.out.println(LetterOrVowel.check("APLUSCOMPSCI"));
		System.out.println(LetterOrVowel.check("77sodacans99"));
		System.out.println(LetterOrVowel.check("aardvark"));
		System.out.println(LetterOrVowel.check("cancancancan"));
	}
}
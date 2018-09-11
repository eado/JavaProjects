//Name - Omar Elamri
//Date - 9/11
//Class - AP CS A Bahr
//Lab  - Variables

public class Variables {
	public static void main ( String[] args ) {
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String

		//integer variables
		byte byte1 = 127;
		short short1 = 8;
		int int1 = 197;
		long long1 = 279403234;

		//decimal variables
		float float1 = 34.556f;
		double double1 = 34.76456;

		//other integer types
		char char1 = 'A';

		//other types
		boolean bool1 = false;
		String string1 = "Hello world";

		//output your information here
		System.out.println("Integer Types:");
		System.out.println("8 bit: byte1: " + byte1);
		System.out.println("16 bit: short1: " + short1);
		System.out.println("32 bit: int1: " + int1);
		System.out.println("64 bit: long1: " + long1);

		System.out.println();
		System.out.println("Real Types:");
		System.out.println("32 bit: float1: " + float1);
		System.out.println("64 bit: double1: " + double1);

		System.out.println();
		System.out.println("Other Int Types:");
		System.out.println("16 bit: char1: " + char1);

		System.out.println();
		System.out.println("Other Types:");
		System.out.println("1 bit (it depends): bool1: " + bool1);
		System.out.println("string1: " + string1);
	}
}
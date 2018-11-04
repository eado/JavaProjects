// Name - Omar Elamri
// Date - 10/17/18
// Class - AP CS A Bahr
// Lab - Arrays

public class OddToEvenRunner {
	public static void main(String args[]) {
		System.out.println(RayOddToEven.go(new int[] { 7, 1, 5, 3, 11, 5, 6, 7, 8, 9, 10, 12345, 11 }));
		System.out.println(RayOddToEven.go(new int[] { 11, 9, 8, 7, 6, 5, 4, 3, 2, 1, -99, 7 }));
		System.out.println(RayOddToEven.go(new int[] { 10, 20, 30, 40, 5, 41, 31, 20, 11, 7 }));
		System.out.println(RayOddToEven.go(new int[] { 32767, 70, 4, 5, 6, 7 }));
		System.out.println(RayOddToEven.go(new int[] { 2, 7, 11, 21, 5, 7 }));
		System.out.println(RayOddToEven.go(new int[] { 7, 255, 11, 255, 100, 3, 2 }));
		System.out.println(RayOddToEven.go(new int[] { 10, 10, 10, 11, 456 }));
		System.out.println(RayOddToEven.go(new int[] { 9, 11, 11, 11, 7, 1000, 3 }));
		System.out.println(RayOddToEven.go(new int[] { 7, 7, 7, 11, 2, 7, 7, 11, 11, 2 }));
		System.out.println(RayOddToEven.go(new int[] { 2, 4, 6, 8, 8 }));
		System.out.println(RayOddToEven.go(new int[] { 250, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, -455 }));
		System.out.println(RayOddToEven.go(new int[] { 9, 10, -8, 10000, -5000, -3000 }));
	}
}
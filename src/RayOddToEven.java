// Name - Omar Elamri
// Date - 10/17/18
// Class - AP CS A Bahr
// Lab - Arrays

public class RayOddToEven {
	public static int go(int[] ray) {
		int indexOdd = -1;
		int indexEven = -1;

		for (int i = 0; i < ray.length; i++) {
			if (indexOdd < 0) {
				if (ray[i] % 2 == 1) {
					indexOdd = i;
				}
			} else {
				if (ray[i] % 2 == 0) {
					indexEven = i;
					break;
				}
			}
		}

		return indexOdd < 0 && indexEven < 0 ? -1 : indexEven - indexOdd;
	}
}
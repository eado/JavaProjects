// Name - Omar Elamri
// Date - 10/17/18
// Class - AP CS A Bahr
// Lab - Arrays

public class RaySmallest {
	public static int go(int[] ray) {
		int sval = ray[0];

		for (int i = 0; i < ray.length; i++) {
			if (ray[i] < sval) {
				sval = ray[i];
			}
		}

		return sval;
	}
}
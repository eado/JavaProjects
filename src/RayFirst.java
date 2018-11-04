// Name - Omar Elamri
// Date - 10/17/18
// Class - AP CS A Bahr
// Lab - Arrays

public class RayFirst {
	public static boolean go(int[] ray) {
		int firstNum = ray[0];
		for (int i = 1; i < ray.length; i++) {
			if (firstNum == ray[i]) {
				return true;
			}
		}

		return false;
	}
}
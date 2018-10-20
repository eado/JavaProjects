// Name - Omar Elamri
// Date - 10/17/18
// Class - AP CS A Bahr
// Lab - Arrays

public class RaySumLast {
	public static int go(int[] ray) {
		int tot = 0;

		for (int i = 0; i < ray.length; i++) {
			if (ray[i] > ray[ray.length - 1]) {
				tot += ray[i];
			}
		}

		if (tot == 0) {
			tot = -1;
		}

		return tot;
	}
}
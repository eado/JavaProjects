// Name - Omar Elamri
// Date - 10/17/18
// Class - AP CS A Bahr
// Lab - Arrays

public class RayTotal {
	public int go(int[] ray) {
		int tot = 0;

		for (int i = 0; i < ray.length; i++) {
			tot += ray[i];
		}

		return tot;
	}
}

// Name - Omar Elamri
// Date - 9/30/18
// Lab - While Loops

import static java.lang.System.*;

public class TenToAny {
	private int base10;
	private int newBase;

	public TenToAny(int baseTen, int base) {
		setTen(baseTen, base);
	}

	public setTen(int baseTen, int base) {
		base10 = baseTen;
		newBase = base;
	}

	public String getNewNum() {
		String newNum = "";
		return newNum;
	}

	public String toString() {
		return base10 + " base 10 is " + getNewNum();
	}

}
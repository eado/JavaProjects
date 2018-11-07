
// Name - Omar Elamri

import static java.lang.System.*;

class Rational implements Comparable<Rational> {
	// add two instance variables
	public int num;
	public int dec;

	public Rational() {
		setRational(1, 1);
	}

	public Rational(int _num, int _dec) {
		setRational(_num, _dec);
	}

	public void setRational(int _num, int _dec) {
		num = _num;
		dec = _dec;
	}

	public void setNumerator(int _num) {
		num = _num;
	}

	public void setDenominator(int _dec) {
		dec = _dec;
	}

	public void add(Rational other) {
		num = (num * other.dec) + (other.num * dec);
		dec = dec * other.dec;

		reduce();
	}

	private void reduce() {
		System.out.println(num + "/" + dec);
		for (int i = (int)Math.round(Math.sqrt(num)); i > 0; i--) {
			if (num % i == 0 && dec % i == 0) {
				num = num / i;
				dec = dec / i;
			}
		}
	}

	public Object clone() {
		return new Rational(num, dec);
	}

	// ACCESSORS

	// write get methods for numerator and denominator

	public boolean equals(Object obj) {
		reduce();
		if (obj.getClass() == new Rational().getClass()) {
			Rational rat = (Rational)obj;
			rat.reduce();
			if (rat.num == num && rat.dec == dec) {
				return true;
			}
		}
		return false;
	}

	public int compareTo(Rational other) {
		double rawNum1 = (double)num / (double)dec;
		double rawNum2 = (double)other.num / (double)other.dec;
		return rawNum1 > rawNum2 ? 1 : rawNum1 == rawNum2 ? 0 : -1;
	}

	public String toString() {
		return num + "/" + dec;
	}

}
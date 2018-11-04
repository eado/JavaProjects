// Name - Omar Elamri
// Date - 10/17/18
// Class - AP CS A Bahr
// Lab - Arrays

public class Fibonacci {
	private int fib;

	public Fibonacci(int _fib) {
		fib = _fib;
	}

	public void setFib(int _fib) {
		fib = _fib;
	}

	public int getFib() {
		return fib;
	}

	public String toString() {
		int pos = 1;
		for (int i = 1; i < Integer.MAX_VALUE; i += i) {
			if (pos == fib) {
				return String.valueOf(i);
			}
			pos++;
		}
		return "-1";
	}
}
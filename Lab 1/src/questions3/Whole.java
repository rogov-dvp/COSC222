package questions3;

public class Whole extends Number {
	
	private int number;
	
	public Whole(int n) {
		number = n;
	}
	
	public String toString() {
		return Integer.toString(number);
	}
	
	public double magnitude() {
		return number;
	}
	
}

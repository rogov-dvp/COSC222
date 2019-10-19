package questions3;

public class Real extends Number{

	private double value;

	public Real (double value) {
		this.value = value;
	}
	
	public String toString() {
		return String.format("%4.2f",value);
	}
	
	public double magnitude() {
		return value;
	}
}

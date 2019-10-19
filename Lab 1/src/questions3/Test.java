package questions3;

public class Test {
	public static void main(String args[]) {
		System.out.print("Number n1 is Real: ");
		Number n1 = new Real(123.4567);
		System.out.println(n1);
		System.out.print("Number n2 is Complex: ");
		Number n2 = new Complex(3.2, 6.7);
		System.out.println(n2);
		System.out.print("Number n3 is Complex: ");
		Number n3 = new Complex(3.2, -6.7);
		System.out.println(n3);
		System.out.print("Number n4 is Whole: ");
		Number n4 = new Whole(13579);
		System.out.println(n4);
		System.out.printf("Magnitude of n1: %8.5f%n", n1.magnitude());
		System.out.printf("Magnitude of n2: %8.5f%n", n2.magnitude());
		System.out.printf("Magnitude of n3: %8.5f%n", n3.magnitude());
		System.out.printf("Magnitude of n4: %7.1f%n", n4.magnitude());
	}
}

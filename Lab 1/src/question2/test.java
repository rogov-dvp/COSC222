package question2;

public class test {

	public static void main(String[] args) {

		Point p1 = new Point();					//Point: 0,0
		Point p2 = new Point(5, 5);				//Point: 5,5
		double distance = p1.distance(p2);
		System.out.format("Distance between %s and %s is %.2f\n", p1, p2, distance);
		Line l1 = new Line(p1, p2);
		System.out.format("Length of %s is %.3f\n", l1, l1.getLength());
	}
}

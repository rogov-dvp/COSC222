package question2;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		x=0;
		y=0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point(Point pnt) {
		this(pnt.x,pnt.y);
	}

	

	//getters and setters	Wasn't sure how do the question without them.
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public double distance(Point another) {
		return Math.sqrt(Math.pow(another.getX(), 2)+Math.pow(another.getY(), 2));
	}
	
	
}

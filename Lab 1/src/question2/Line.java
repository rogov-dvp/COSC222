package question2;

public class Line {

	private Point begin;
	private Point end;
	
	
	public Line(int x1, int x2, int y1, int y2) {
		begin.setX(x1);
		begin.setY(y1);
		end.setX(x1);
		end.setY(y1);
	}
	
	public Line(Point p1, Point p2) {
		begin = p1;
		end = p2;
	}

	
	public String toString() {
		return "Line (("+begin.getX()+","+end.getY()+"),("+begin.getX()+","+end.getY()+")";
	}
	
	public double getLength() {
		
		return begin.distance(end);
	}
	
	
}

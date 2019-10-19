package question3;

public class NodeQ3 {
	
	private String name;
	private int amount;
	private NodeQ3 next;
	
	public NodeQ3(String name, int amount, NodeQ3 next) {
		this.name = name;
		this.amount = amount;	
		this.next = next;
	}
	
	
	public NodeQ3 getNext() {
		return next;
	}
	
	public String toString() {
		return "(" + name + ":" + amount + ")";
	}
}

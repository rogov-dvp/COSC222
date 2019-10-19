package question4;

public class NodeQ4 {
	private String name;
	private int amount;
	private NodeQ4 next;
	
	public NodeQ4(String name, int amount, NodeQ4 next) {
		this.name = name;
		this.amount = amount;	
		this.next = next;
	}
	
	
	public NodeQ4 getNext() {
		return next;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "(" + name + ":" + amount + ")";
	}
}

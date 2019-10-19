package question3;

public class ItemListQ3 {
	private NodeQ3 head;		//instead of the name "top"

	public ItemListQ3() {
	}
	
	public void add(String name, int amount) {
		
		NodeQ3 NewNode = new NodeQ3(name, amount, head);
		head = NewNode;
		
	}
	
	public String toString() {
		String str = "[ ";
		
		if(head != null) {
			NodeQ3 current = head;
			while (current != null) {
				str += current.toString() + " ";
				current = current.getNext();
			}
		}
		str += "]";
		return str;
	}
	
}

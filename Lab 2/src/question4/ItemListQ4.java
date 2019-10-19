package question4;

public class ItemListQ4 {
	private NodeQ4 head;		//instead of the name "top"

	public ItemListQ4() {
	}
	
	public void add(String name, int amount) {
		
		NodeQ4 NewNode = new NodeQ4(name, amount, head);
		head = NewNode;
		
	}
	
	public String toString() {
		String str = "[ ";
		
		if(head != null) {
			NodeQ4 current = head;
			while (current != null) {
				str += current.toString() + " ";
				current = current.getNext();
			}
		}
		str += "]";
		return str;
	}
	
	public void insert(String name, int amount) {
		
		if(head == null) {
			add(name, amount);
		} else {		
			
		if(head.getAmount()>= amount) 										//smaller number goes first	
			add(name,amount);												//Smaller amount ends up as first ("head"'s position)
		else  {																//if head amount is smaller than new node
			 NodeQ4 newNode = new NodeQ4(name,amount,null);					//Make node point to null, since it's at the end
			 head = new NodeQ4(head.getName(),head.getAmount(),newNode);	//Make head equal to its attributes and point to newNode
		}}
	}
}

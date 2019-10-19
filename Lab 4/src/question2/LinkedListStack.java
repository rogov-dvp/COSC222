package question2;

public class LinkedListStack<T> implements StackADT<T> {
	
	private Node<T> root = new Node<T>(null,null); 				//root points to top of stack
	private int counter;
	
	// Initializes an empty stack.
	public LinkedListStack() {
	}

	// Adds the specified element to the top of the stack,
	@Override
	public void push(T element) {
			Node<T> newNode = new Node<T>(element,null);	// contains element and points to null(until next step)
			newNode.setNext(root.getNext());				// newNode next points to the previous top-of-the-stack
			root.setNext(newNode);							// Set root point to newNode 
			counter++;
	}

	// Removes the element at the top of the stack and returns a
	// reference to it.
	@Override
	public T pop() {
		if(isEmpty()) {
			System.out.println("Stack is already Empty");
			return null;
		} 
		Node<T> result = root.getNext();					// Finds top of stack, now must re-adjust node.next in the following 2 steps:
		root.setNext(result.getNext());						// Sets root's next= results.next
		result.setNext(null);								// Set result.next = null
		counter--;											// Decrease size increment;
		return result.getBook();							// return book in result
	}

	// Returns the top item
	@Override
	public T peek() {
		if(isEmpty()) {
			System.out.println("Stack is already Empty");
			return null;
		} 
		Node<T> result = root.getNext();
		return result.getBook();
	}

	// Returns true if the stack is empty and false otherwise
	@Override
	public boolean isEmpty() {
		return root.getNext()==null;
	//	return counter==0;
	}

	// Returns the number of elements in the stack
	@Override
	public int size() {
		return counter;
	}

	// Returns a string representation of this stack.
	@Override
	public String toString() {
		String str = "";
		Node<T> temp = root.getNext();								//make temp= root so we don't change root's placement
		while(temp != null) {
			str = str + temp.toString() + "\n";			//take string of the element which root points to
			temp = temp.getNext();							//Change temp to the next node. That way we can read it's next node. So on.
		}
		return str;
	}
}

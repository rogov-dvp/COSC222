package question1;


public class ArrayStack<T> implements StackADT<T> {

	private final int DEFAULT_CAPACITY = 1;
	private T[] stack;
	private int top;

	// Creates an empty stack using the default capacity.
	public ArrayStack() {
		top = 0;										// points to the first element. Since empty, points 0
		stack = (T[]) (new Object[DEFAULT_CAPACITY]);	// Casting to whatever is our desired element.
	}

	// Creates an empty stack using the specified capacity.
	public ArrayStack(int initialCapacity) {
		top = 0;
		stack = (T[]) (new Object[initialCapacity]);
	}

	// Adds a specified element to the top of the stack and expands the capacity, if
	// needed
	@Override
	public void push(T element) {
		if(top == stack.length) 
			expandCapacity();
		
		stack[top] = element;
		top++;

	}

	// Removes the element at the top of the stack and returns a reference to it.
	@Override
	public T pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		return null;}
		top--;						//top-- now before since we need index top-1
		T result = stack[top];
		stack[top] = null;
		return result;
			
	}

	// Returns the top item
	@Override
	public T peek() {

		T result = stack[top-1];
		return result;
	}

	// Returns true if the stack is empty and false otherwise
	@Override
	public boolean isEmpty() {
		return(size() == 0);
	}

	// Returns the number of elements in the stack
	@Override
	public int size() {
		return top;
	}

	// Returns a string representation of this stack.
	@Override
	public String toString() {
		String result = "";
		
		for(int i = 0; i < top; i++) {
			result = result + stack[i].toString() + "\n";	//shouldn't it start at max --> 0 since its a stack
		}
		
		return result;
	}

	// Expands the size of the stack
	private void expandCapacity() {
		T[] larger = (T[]) (new Object[stack.length*2]);		//double size of previous stack
		
		for(int i = 0; i < stack.length; i++)
			larger[i] = stack[i];
		
		stack = larger;
	}

}

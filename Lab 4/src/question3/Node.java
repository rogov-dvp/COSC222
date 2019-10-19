package question3;

public class Node<T> {

	private T book;
	private Node<T> next;

	public Node(T book, Node<T> next) {
		setBook(book);
		setNext(next); 
	}

	
	public T getBook() {
		return book;
	}


	public void setBook(T book) {
		this.book = book;
	}

	public Node<T> getNext() {
		return next;
	}


	public void setNext(Node<T> next) {
		this.next = next;
	}


	public String toString() {
		return book.toString();
	}
}
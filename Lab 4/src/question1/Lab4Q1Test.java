package question1;

public class Lab4Q1Test {

	public static void main(String[] args) {
		StackADT<Book> book = new ArrayStack<Book>();
		book.push(new Book("Introduction to Algorithms", "Thomas H. Cormen", 121.99));
		book.pop();
		book.pop();
		book.push(new Book("Data Structures and Algorithms Made Easy", "Narasimha Karumanchi", 35.99));
		book.push(new Book("Data Structures and Algorithms in Java", "Michael T. Goodrich, Roberto Tamassia", 51.99));
		System.out.println("Stack size:" + book.size());
		System.out.println("The stack contents:\n" + book);
		book.pop();
		book.push(new Book("The Algorithm Design Manual", "Steven Skiena", 55.99));
		book.pop();
		System.out.println("Stack size: " + book.size());
		System.out.println("The stack contents:\n" + book);
	}
}

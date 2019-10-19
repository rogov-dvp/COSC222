package question1;

public class Book{
	private String name;
	private String author;
	private double price;		//made double since Test class uses double values

	public Book(String name, String author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public void setName() {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAuthor() {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setPrice() {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public String toString() {
		return name +", "+ author +", "+ price;
	}
	
}

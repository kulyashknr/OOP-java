
public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty = 0;
	
	public Book(String name, Author author, double price) {
		name = "no name yet";
		author = null;
		price = 0;
	}
	
	public Book(String name, Author author, double price, int qty) {
		name = "no name yet";
		author = null;
		price = 0;
		qty = 0;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "Book[name = " + name + Author.toString() + " price = "  + price + " qty = " + qty + "]";
	}
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof Book))  {
			return false;
		}
		
		Book b = (Book)o;
		return ((name.equals(b.name)) && (price == b.price) && (author.equals(b.author)));
		
	}
	
	public int compareTo(int otherQty) {
		if (qty < otherQty) return -1;
		if (qty > otherQty) return 1;
		return 0;
	}
	
	public int hashcode() {
		return name.hashCode();
	}
	
	public Object clone() {
		Book b1 = new Book(name, author, price);
		Book b2 = new Book(name, author, price);
		return b2.clone(b1);
	}
}

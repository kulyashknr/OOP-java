
public class Person_poly {
	String name;
	
	Person_poly() {
		this.name = "no name";
	}
	
	Person_poly(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Name is: " + name;
	}
}

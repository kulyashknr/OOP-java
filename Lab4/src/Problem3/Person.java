package Problem3;

public class Person {
	public String name;
	
	public Person() {
		name = "no name yet ";
	}
	
	public Person(String name) {
		this.name = name; 
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public String toString() {
		return "I am " + name;
	}
	
	public boolean Equals(Person p) {
		return name.equals(p.name);
	}
}



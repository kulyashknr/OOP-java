package Problem2;

public abstract class Animal {
	public String name;
	
	public Animal() {
		name = "NO NAME";
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public String toString() {		
		return name;		
	}
	
	abstract public boolean Eat(String food);
}
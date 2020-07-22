
public class Rabbit extends Animal {
	String color;
	String food;
	int amount;
	
	public Rabbit(String name, String color) {
		super(name);
		this.color = color;
	}
	
	public Rabbit() {
		super();
		color = "NO COLOR ";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return color + " " + super.toString();
	}
	
	public String Eat(int amount) {
		if (amount > 0) 
			return " pokushal";
		return " ne pokushal";
	}
	
	public String Eat(String food, int amount) {
		if ((amount > 0) && (food.equals("morkovka")))				
			return " pokushal morkovku";
		return " ne pokushal morkovku";		
		
	}
}

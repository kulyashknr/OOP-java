package Problem2;

public class Rabbit extends Animal {
	public int EarsLenght;
	
	public Rabbit() {
		super();
		EarsLenght = 0;
	}
	
	public Rabbit(String name, int EarsLenght) {
		super(name);
		this.EarsLenght = EarsLenght;
	}
	
	public int getEarsLenght() {
		return EarsLenght;
	}

	public void setEarsLenght(int EarsLenght) {
		this.EarsLenght = EarsLenght;
	}
	
	public String toString() {
		return super.toString() + "and it's ears lenght is " + EarsLenght + "cm";
	}
	
	@Override
	public boolean Eat(String food) {
		// TODO Auto-generated method stub
		if (food.equals("morkovka")) 
			return true;
		return false;
	}


	
}
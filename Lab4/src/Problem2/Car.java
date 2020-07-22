package Problem2;

public class Car implements Moveable {
	int x,y;
	int fuel;
	
	public void addFuel() {
		fuel++;
	}
	
	public void Move() {
		x++;
		y++;
	}
}

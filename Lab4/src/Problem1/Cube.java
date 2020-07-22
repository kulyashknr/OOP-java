package Problem1;

public class Cube implements Shapes {
	int height;
	
	public Cube() {
		height = 0;
	}
	
	public Cube(int height) {
		this.height = height;
	}
	
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return Math.pow(height, 2) * 6;
	}

	public double volume() {
		// TODO Auto-generated method stub
		return Math.pow(height, 3);
	}
	
}

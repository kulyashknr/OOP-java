package Problem1;

public class Cylinder implements Shapes {
	int radius;
	int height;
	
	public Cylinder() {
		radius = 0;
		height = 0;
	}
	
	public Cylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}
	
	public double volume() {
		return Math.PI * radius * radius * height;
	}
	
	public double surfaceArea() {
		return 2 * Math.PI * radius * (radius + height);
	}
}

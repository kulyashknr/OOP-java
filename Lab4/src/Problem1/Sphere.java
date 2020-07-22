package Problem1;

public class Sphere implements Shapes {
	int radius;
	
	public Sphere() {
		radius = 0;
	}
	
	public Sphere(int radius) {
		this.radius = radius;
	}
	
	public double volume() {
		return (4 * Math.PI * Math.pow(radius, 3))/3;
	}
	
	public double surfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
}


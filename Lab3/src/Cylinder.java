
public class Cylinder extends Shapes{
	int h;
	int r;
	
	public Cylinder(int h, int r) {
		this.h = h;
		this.r = r;
	}
	
	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return 2*Math.PI*r*(h+r);
	}

	@Override
	public double Volume() {
		// TODO Auto-generated method stub
		return Math.PI*r*r*h;
	}

}

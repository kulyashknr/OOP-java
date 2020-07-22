
public class Sphere extends Shapes {
	int r;
	
	public Sphere(int r) {
		this.r = r;
	}
	
	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return 4*Math.PI*r*r;
	}

	@Override
	public double Volume() {
		// TODO Auto-generated method stub
		return (4/3)*Math.PI*r*r*r;
	}

}

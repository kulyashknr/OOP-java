
public class Cube extends Shapes {
	
	int a;
	
	public Cube() {
		a = 1;
	}
	
	public Cube(int a) {
		this.a = a;
	}
	
	@Override
	public double surfaceArea() {		
		// TODO Auto-generated method stub	
		return a*a;
	}

	@Override
	public double Volume() {
		// TODO Auto-generated method stub
		return a*a*a;
	}

}

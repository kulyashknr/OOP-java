package Problem4;

public class Bird implements Fly {
	int x,y,z;
	
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		this.x += x;
		this.y += y;
	}

	@Override
	public void fly(int x, int y, int z) {
		// TODO Auto-generated method stub
		this.x += x;
		this.y += y;
		this.z += z;
	}

}

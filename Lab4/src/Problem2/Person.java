package Problem2;

public class Person implements Moveable {
	int x,y;
	String name;
	int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void Move() {
		x++;
		y++;
	}

}

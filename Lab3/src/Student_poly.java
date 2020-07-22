
public class Student_poly extends Person_poly {
	int course;
	
	Student_poly() {
		super();
		course = 1;
	}
	
	Student_poly(String name) {
		super(name);
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return super.toString() + " " + course;
	}
}

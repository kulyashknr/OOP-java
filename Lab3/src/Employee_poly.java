
public class Employee_poly extends Person_poly{
	int salary;
	
	Employee_poly() {
		super();
		this.salary = 100;
	}
	
	Employee_poly(String name) {
		super(name);
		this.salary = 200;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return super.toString() + " my salary is " + salary;
	}
}

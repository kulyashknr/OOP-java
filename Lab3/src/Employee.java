
public class Employee extends Person {
	public double salary;
	int year;
	String insuranceNumber;
	
	public Employee() {
		super();
		year = 0;
		insuranceNumber = "no number yet ";
		salary = 0;
	}
	
	public Employee(String name, double salary, int year, String insuranceNumber) {
		super(name);
		this.year = year;
		this.insuranceNumber = insuranceNumber;
		this.salary = salary;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getNumber() {
		return insuranceNumber;
	}
	
	public void setNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return super.toString() + " an employee";
	}
	
	public boolean Equals(Employee e) {
		return super.equals(e) && (this.salary == e.salary) && 
				(this.year == e.year) && (this.insuranceNumber == e.insuranceNumber);
	}
}

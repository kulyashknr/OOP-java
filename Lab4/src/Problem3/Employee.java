package Problem3;
import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable, Cloneable {
	public double salary;
	Date hireDate;
	String insuranceNumber;
	
	public Employee() {
		super();
		hireDate = null;
		insuranceNumber = "no number yet ";
		salary = 0;
	}
	
	public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
		super(name);
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
		this.salary = salary;
	}
	
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		if (salary > e.salary) 
			return 1;
		if (salary < e.salary) 
			return -1;
		return 0;
	}
	
	public Employee clone() throws CloneNotSupportedException {
		Employee clone = (Employee) super.clone();
		clone.hireDate = (Date) hireDate.clone();
		return clone;
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
				(this.hireDate == e.hireDate) && (this.insuranceNumber == e.insuranceNumber);
	}
	
	public int hashcode() {
		return Objects.hash(insuranceNumber);
	}
}

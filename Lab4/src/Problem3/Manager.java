package Problem3;
import java.util.Date;
import java.util.Vector;
public class Manager extends Employee implements Comparable{
	Vector<Employee> Employes = new Vector<>();
	int bonus;
	
	public int compareTo(Object o) {
		if(super.compareTo(o) == 0) {
			Manager m1 = (Manager)o;
			if (bonus > m1.bonus) 
				return 1;
			if (bonus < m1.bonus) 
				return -1;
			return 0;
		}
		return 0;
	}
	
	public int Bonus() {
		if (Employes.size() > 1) 
			bonus = Employes.size()*10;
		return bonus;
	}
	
	public Manager() {
		super();
		bonus = 0;
	}
	
	public Manager(String name, double salary, Date hireDate, String insuranceNumber, int bonus) {
		super(name, salary, hireDate, insuranceNumber);
		this.bonus = bonus;
	}	
	
	public String toString() {
		return super.toString() + " a manager";
	}
	
	public void addTeam(Employee e) {
		Employes.add(e);
	}
	
	public boolean Equals (Manager m) {
		return super.Equals(m) && (m.bonus == this.bonus);		
	}
}


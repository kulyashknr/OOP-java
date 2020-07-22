import java.util.Vector;
public class Manager extends Employee {
	//public Vector<Employee> Employes;
	Vector<Employee> Employes = new Vector<>();
	int bonus;
	
	public int Bonus() {
		if (Employes.size() > 1) 
			bonus = Employes.size()*10;
		return bonus;
	}
	
	public Manager() {
		super();
		bonus = 0;
	}
	
	public Manager(String name, double salary, int year, String insuranceNumber, int bonus) {
		super(name, salary, year, insuranceNumber);
		this.bonus = bonus;
	}
	
	public String toString() {
		return super.toString() +  " a manager";
	}
	
	public void addTeam(Employee e) {
		Employes.add(e);
	}
	
	public boolean Equals (Manager m) {
		return super.Equals(m) && (m.bonus == this.bonus);		
	}
}

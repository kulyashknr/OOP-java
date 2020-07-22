
public class Manager_test {
	public static void main (String[] args) {
		Employee e1 = new Employee("Sara", 33, 1, "AAA");
		Employee e2 = new Employee("Dan", 100, 3, "BBB");
		Employee e3 = new Employee("Molly", 70, 2, "CCC");
		Manager m1 = new Manager("Billy", 64, 4, "DDD", 0);
		Manager m2 = new Manager("Kate", 210, 7, "EEE", 0);
		
		m1.addTeam(e1);
		m1.addTeam(e2);
		m2.addTeam(e3); 

		System.out.println(m1.Bonus());
		System.out.println(e1.Equals(e2));
		System.out.println(m1.toString()); 
	}
}

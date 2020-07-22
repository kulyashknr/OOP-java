
public class Poly_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_poly studentObject = new Student_poly("Sally");
		Employee_poly employeeObject = new Employee_poly("Dan");
		Person_poly ref = studentObject;
		
		String temp = ref.getName();
	//	System.out.println(temp);
		System.out.println(ref+ "\n");
		
		ref = employeeObject;
		temp = ref.getName();
	//	System.out.println(temp);
		System.out.println(ref);
	
	}

}

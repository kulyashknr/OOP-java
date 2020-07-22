
public class Test {

	public static void main(String[] args) {
		int[] b = {0,1,2,3};
		MyVector a = new MyVector(b);
		
		a.add(1);
		a.add(3);
		a.add(-2);

		System.out.println(a);
		

	}

}

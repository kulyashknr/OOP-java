package Problem5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0, 8 , -3, 20};
		
		MinMax m = new MinMax();
		MinMax.Pair p = m.minmax(a);
		System.out.println(p.min + " " + p.max);
		
	}

}

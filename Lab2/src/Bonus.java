import java.util.Scanner;

public class Bonus {
	String[] a = {"","one","two","three","four","five","six","seven",
			"eight","nine","ten","eleven","twelve","thirteen",
			"fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	String[] b = {"twenty","thirty","fourty","fifty","sixty","seventy",
			"eighty","ninety"};
	
	public String smaller100(int x)
	{
		int place = x/10;
		int place2 = x%10;
		if(x<20)
			return a[x];
		return b[place-2]+" "+a[place2];
				
	}
	
	public String smaller1000(int x)
	{
		int place = x/100;
		int place2 = x%100;
		if(x >= 100)
			return a[place]+" hundred "+smaller100(place2);
		else
			return smaller100(x);
	}
	
	public String smaller10000(int x)
	{
		int place = x/1000;
		int place2 = x%1000;
		if(x>=1000)
			return a[place]+" thousand "+ smaller1000(place2);
		else 
			return smaller1000(x);
			
	}
	
	public String inWord(int x)
	{
		return smaller10000(x);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner1 = new Scanner(System.in);
		int num = scanner1.nextInt();
		Bonus c = new Bonus();
		System.out.println(c.inWord(num));

	}

}

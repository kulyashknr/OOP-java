
import java.util.ArrayList;

public class Dragon {
	public ArrayList<Person> people = new ArrayList<Person>();
	public Dragon() 
	{
	
	}
	
	public void kidnap(Person children)
	{
		people.add(children);
	}
	
	public boolean willDragonEatOrNot() 
	{
		int a = 0;
		for (int i=0; i<people.size(); i++)
		{
			if (people.get(i).g == Gender.Boy) 
				a++;
			else 
				a--;
			//if (a < 0)	return true;
		}
		return a != 0 ;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dragon drag = new Dragon();
		Person p1 = new Person(Gender.Boy);
		Person p2 = new Person(Gender.Boy);
		Person p3 = new Person(Gender.Girl);
		Person p4 = new Person(Gender.Girl);
		
	//	drag.kidnap(p1);
		
		drag.kidnap(p3);drag.kidnap(p2);
	//	drag.kidnap(p4);
		
		System.out.println(drag.willDragonEatOrNot());
	}

}

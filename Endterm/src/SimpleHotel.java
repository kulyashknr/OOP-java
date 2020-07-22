import java.io.Serializable;
import java.util.ArrayList;

public class SimpleHotel implements Hotel, Serializable {
	public String name;
	public Address a;
	public int stars;
	static ArrayList<Room> rooms = new ArrayList<Room>();

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Hotel";
	}

}

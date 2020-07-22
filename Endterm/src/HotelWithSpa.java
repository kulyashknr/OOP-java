import java.io.Serializable;
import java.util.ArrayList;

public class HotelWithSpa extends HotelDecorator implements Serializable {
	
	public HotelWithSpa(Hotel h) {
		super(h);
		// TODO Auto-generated constructor stub
	}
	
	ArrayList<Room> rooms = new ArrayList<Room>();
	@Override
	
	public int getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 200;
	}
	
	public String getInfo() {
		return super.getInfo() + "With SPA";
	}
}

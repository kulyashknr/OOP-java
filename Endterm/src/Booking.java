import java.io.Serializable;

public class Booking implements Serializable{
	//User u;
	Hotel h;
	Room r;
	Date d;
	
	
	public String toString() {
		return "Booked: " + h + " hotel, " + r + " room for " + d; 
	}
	
	public Booking(Hotel h, Room r, Date d) {
		this.h = h;
		this.r = r;
		this.d = d;
	}
}

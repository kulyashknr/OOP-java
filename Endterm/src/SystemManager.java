
public class SystemManager {
	public String login, password;
	Data d = new Data();
	
	public void addUser(User u) {
		d.users.add(u);
	}
	
	public void addHotel(Hotel h) {
		d.hotels.add(h);
	}
	
	public void addRoom(Room r) {
		d.rooms.add(r);
	}
	
	public void addBooking(Booking b) {
		d.bookings.add(b);
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Data getData() {
		return d;
	}
	
	public void setLogin(Data d) {
		this.d = d;
	}
	
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof SystemManager))
			return false;
		SystemManager s = (SystemManager)o;
		return (d.equals(s.d));
		
	}
	
	public int hashCode() {
		int result = 17;
		result += 31 * result + d.hashCode();
		return result;
	}
}

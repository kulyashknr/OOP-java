import java.io.Serializable;

public class User implements Serializable{
	public String name;
	public String login;
	public String password;
	Data db = new Data();
	//int a = Room.num;

	public User() {
		name = null;
		login = null;
		password = null;
	}

	public User(String name, String login, String password) {
		this.name = name;
		this.login = login;
		this.password = password;
	}

	public String toString() {
		return "Name: " + name + "\nLogin: " + login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof User))
			return false;
		User u = (User)o;
		return (name.equals(u.name)) && (login.equals(u.login)) &&
				(password.equals(u.password));

	}

	public int hashCode() {
		int result = 17;
		result += 31 * result + name.hashCode();
		result += 31 * result + login.hashCode();
		result += 31 * result + password.hashCode();
		return result;
	}

	public boolean canBook(Hotel h, int a, int b) {
		if ((!(SimpleHotel.rooms[a])) || (!(Date.date[b][b]))) return false;
		return true;	
	}

	public void Book(Hotel h, int a, int b) {
		SimpleHotel.rooms[a] = false;
		Date.date[b][b] = false;
		db.bookings.add(new Booking(h,a,b));
	}
}

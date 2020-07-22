import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Data implements Serializable {
	static ArrayList<User> users = new ArrayList<User>();
	static ArrayList<Hotel> hotels = new ArrayList<Hotel>();
	static ArrayList<Room> rooms = new ArrayList<Room>();
	static ArrayList<Booking> bookings = new ArrayList<Booking>();
	
	@SuppressWarnings("unchecked")
	public static void desirUsers() throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("users.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
	    users = (ArrayList<User>) ois.readObject();
	  }
	  
	  public static void serUsers() throws IOException{
		FileOutputStream fos = new FileOutputStream("users.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(users);
	    oos.close();
	  }
	  
	  @SuppressWarnings("unchecked")
	public static void desirHotels() throws IOException, ClassNotFoundException{
			FileInputStream fis = new FileInputStream("hotels.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
		    hotels = (ArrayList<Hotel>) ois.readObject();
	  }
		  
	  public static void serHotels() throws IOException{
			FileOutputStream fos = new FileOutputStream("hotels.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		    oos.writeObject(hotels);
		    oos.close();
	  }
		  
	  @SuppressWarnings("unchecked")
	public static void desirRooms() throws IOException, ClassNotFoundException{
			FileInputStream fis = new FileInputStream("rooms.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
		    hotels = (ArrayList<Hotel>) ois.readObject();
	  }
		  
	  public static void serRooms() throws IOException{
			FileOutputStream fos = new FileOutputStream("rooms.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		    oos.writeObject(rooms);
		    oos.close();
	  }
	  
	  @SuppressWarnings("unchecked")
	public static void desirBookings() throws IOException, ClassNotFoundException{
			FileInputStream fis = new FileInputStream("bookings.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
		    bookings = (ArrayList<Booking>) ois.readObject();
	  }
		  
	  public static void serBookings() throws IOException{
			FileOutputStream fos = new FileOutputStream("bookings.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		    oos.writeObject(bookings);
		    oos.close();
	  }
}

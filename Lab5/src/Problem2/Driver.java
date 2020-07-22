package Problem2; 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.IOException; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream; 
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.Scanner; 

public class Driver { 
	static String title;
	static Instructor i;
	static Textbook t;
	
	static List<Course> courses = new ArrayList<Course>(); 
	static List<Textbook> books = new ArrayList<Textbook>(); 
	static List<Instructor> teachers = new ArrayList<Instructor>();
	
	public static List<Course> deserializeC() throws IOException, ClassNotFoundException{ 
		List <Course> courses = new ArrayList<Course>();
		try { 
		FileInputStream fis = new FileInputStream("course.out"); 
		ObjectInputStream oin = new ObjectInputStream(fis); 
		courses = (List<Course>)oin.readObject(); 
		fis.close();
		oin.close();
		}
		catch (IOException IO){
			System.out.println("Error in course");
		}
		
		return courses; 
	} 
	
	public static List<Textbook> deserializeT() throws IOException, ClassNotFoundException, EOFException{ 
		List <Textbook> books = new ArrayList<Textbook>();
		try { 
		FileInputStream fis = new FileInputStream("textbook.out"); 
		ObjectInputStream oin =new ObjectInputStream(fis); 
		books = (List<Textbook>)oin.readObject();
		fis.close();
		oin.close();
		} 
		catch (IOException IO){
			System.out.println("Error in teach");
		}
		return books; 
	} 
	
	public static List<Instructor> deserializeI() throws IOException, ClassNotFoundException{ 
		List <Instructor> instructors = new ArrayList<Instructor>();
		try { 
		FileInputStream fis = new FileInputStream("instructor.out"); 
		ObjectInputStream oin =new ObjectInputStream(fis); 
		instructors = (List<Instructor>)oin.readObject();
		}
		catch (IOException IO){
			System.out.println("Error in inst");
		}
		return instructors; 
	} 
	
	public static void SerializeT(List<Textbook> l) throws IOException { 
		FileOutputStream fos = new FileOutputStream("textbook.out"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(l); 
		oos.flush(); 
		oos.close(); 
		fos.close();
	} 
	
	public static void SerializeC(List<Course> l) throws IOException { 
		FileOutputStream fos = new FileOutputStream("course.out"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(l); 
		oos.flush(); 
		oos.close(); 
		fos.close();
	} 
	
	public static void SerializeI(List<Instructor> l) throws IOException { 
		try { 
		FileOutputStream fos = new FileOutputStream("instructor.out"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(l); 
		oos.flush(); 
		oos.close(); 
		fos.close();
		}
		catch (IOException IO){
			System.out.println("Error in inst");
		}
	} 
		
	// USER	
	public static void getListOfCourses() throws ClassNotFoundException, IOException { 	
		System.out.println("Courses:");
		for (Course c : courses) {
			System.out.println(c.courseTitle);
		}	 
	} 
	public static void getTextbooks() throws IOException, ClassNotFoundException { 
		System.out.println("Textbooks:");
		for (Textbook t : books) {
			System.out.println(t);
		}	
	} 
	
	public static void getCourseInfo() throws IOException, ClassNotFoundException{ 
		for (Course c : courses) {
			System.out.println(c.toString());
		}	
	}
	
	public static void getInstructors() throws ClassNotFoundException, IOException {
		System.out.println("Teachers:");
		for (Instructor i : teachers) {
			System.out.println(i);
		}	
	} 
	
/*	public static void getListOfInstructors() throws ClassNotFoundException, IOException { 
		List<Instructor> dInstructors = deserializeI();
		System.out.println("Teachers:");
		for(Instructor i : dInstructors) {
			System.out.println(i.getLastName());
		}	
	}  */
	
	// ADMIN
	
	static String login = "kulyash"; 
	static String password = "admin"; 
	
	public static void addCourse(Course c) throws IOException, ClassNotFoundException { 
		courses.add(c);
	} 
	
	public static void addTextbook(Textbook t) throws IOException, ClassNotFoundException { 
		books.add(t);		
	} 
	
	public static void addInstructor(Instructor i) throws IOException, ClassNotFoundException {
		teachers.add(i);
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException { 
		FileWriter fw = new FileWriter("admin.txt", true); 
		BufferedReader bw = new BufferedReader(new FileReader("admin.txt"));
		teachers = deserializeI();
		books = deserializeT();
		courses = deserializeC();
		
		int hash = password.hashCode();
		if (bw.readLine() == null) {
			fw.write(login + "\n"); 		
			fw.append(hash + "\n"); 
		}

		System.out.println("Select mode:\nPress (1) to choose USER mode \nPress (2) to choose ADMIN mode"); 
		Scanner sc = new Scanner(System.in); 
		int a = sc.nextInt(); 
		
		if (a == 1) {
			System.out.println("Press 1 to view all courses\nPress 2 to view all textbooks" 
			+ "\nPress 3 to view information about courses\nPress 4 to view all instructors\nPress 5 to EXIT"); 
			a = sc.nextInt(); 
		//	while(true) {
			if (a == 1) getListOfCourses(); 
				else if (a == 2) getTextbooks(); 
					else if (a == 3) getCourseInfo(); 
						else if (a == 4) getInstructors();
							else if (a == 5) {
									System.out.println("EXIT.");
								//	break;
							}
			else System.out.println("Wrong input!");
		}
	//	} 
		
		else if (a == 2) { 
			System.out.println("Enter login and password:"); 
			String log = sc.next(); 
			String pas = sc.next(); 
			if (log.equals(login) && pas.hashCode() == hash) { 
				if (pas.equals(password)) { 
				
				while (true) {
				System.out.println("Press (1) to add a course\nPress (2) to add a teacher\nPress (3) to add a textbook\nPress (4) to exit"); 
				int n = Integer.parseInt(sc.next());
				LocalDateTime time = LocalDateTime.now(); 
				
				if (n == 1) { 
					System.out.println("Enter title of the course"); 
						title = sc.next();
					System.out.println("Enter instructor's first name, last name, department and email of the course");
						String fname = sc.next();
						String lname = sc.next();
						String dep = sc.next();
						String gm = sc.next();
						i = new Instructor(fname, lname, dep, gm);
						addInstructor(i);
					System.out.println("Enter textbook's title, author and isbn of the course");
						String tit = sc.next();
						String auth = sc.next();
						String is = sc.next();
						t = new Textbook(tit, auth, is);
						addTextbook(t);
						Course c = new Course(title, t, i);
						addCourse(c); 
					//	SerializeC(courses);
						String reportC = "Admin added a new course " + title + "\n"; 
						fw.append (time + " " + reportC); 
						System.out.println("You added a new course!");
				}
					
				if (n == 2) {
					System.out.println("Enter teacher's first and last name, department and e-mail");
						Instructor i = new Instructor(sc.next(),sc.next(),sc.next(),sc.next());
						addInstructor(i);
						//SerializeI(teachers);
						String reportI = "Admin added a new instructor " + i.getFirstName() + " " + i.getLastName() + "\n"; 
						fw.append(time + " " + reportI);
						System.out.println("You added a new instructor!");
				}
				
				if (n == 3) {
					System.out.println("Enter textbook's title, author and isbn");
						Textbook t = new Textbook(sc.next(),sc.next(),sc.next());
						addTextbook(t);	
						//SerializeT(books);
						String reportT = "Admin added a new textbook " + t.getTitle() + "\n"; 
						fw.append(time + " " + reportT);
						System.out.println("You added a new textbook!");
				} 			
				
				if (n == 4) {
					System.out.println("EXIT.");
					break;
				}
				
			}
		}
	}
		else {
			System.out.println("Wrong login or password!");
			System.exit(0);
		}
			
}
		
		                                                              
		try {
			SerializeT(books); 
		}
		catch (Exception e) { 
			System.out.println("Error");
			e.printStackTrace();
		} 
		
		try {
			SerializeC(courses);
		}
		catch(Exception e) { 
			System.out.println("Error");
			e.printStackTrace();
		}
		
		try { 
			SerializeI(teachers);
		}
		catch (Exception e) { 
			System.out.println("Error");
			e.printStackTrace();
		}
		
		fw.close(); 
		}
	}
	


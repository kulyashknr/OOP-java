package d;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Vector;

public class Test {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static // Admin Mode

	Faculty selectFaculty() throws NumberFormatException, IOException {
		int i = 0;
		for (Faculty f : Admin.getInstance().allFaculties) {
			i++;
			System.out.println(i + " " + f.name);
		}
		int faculch = Integer.parseInt(br.readLine());
		// if(faculch==0) break;
		i = 0;
		Faculty f = Admin.getInstance().allFaculties.get(faculch - 1);
		return f;
	}

	static void addStudent() throws IOException {
		while (true) {
			System.out.println("Enter new student's full name(first name and last name):");
			String name = br.readLine();
			String surname = br.readLine();

			System.out.println("Select student's faculty:");
			for (int i = 0; i < Admin.getInstance().getInstance().allFaculties.size(); i++) {
				System.out.println((i + 1) + ") " + Admin.getInstance().allFaculties.get(i).toString());
			}
			Faculty f = Admin.getInstance().allFaculties.get(Integer.parseInt(br.readLine()) - 1);
			System.out.println("Select student's specialization:");
			for (int j = 0; j < f.specializations.size(); j++) {
				System.out.println((j + 1) + ") " + f.specializations.get(j).toString());
			}
			Specialization s = f.specializations.get(Integer.parseInt(br.readLine()) - 1);
			System.out.println("Does student have grant?\n1 - yes\n2 - no");
			System.out.println("Is this new student?\n1 - yes\n2 - no");
			int answer = Integer.parseInt(br.readLine());
			boolean grant;
			if (answer == 1)
				grant = true;
			else
				grant = false;
			int opt = Integer.parseInt(br.readLine());
			Student student;
			if (opt == 2) {
				System.out.println("Please enter student's total gpa:");
				double gpa = Double.parseDouble(br.readLine());
				System.out.println("Please enter student's year of study");
				int year = Integer.parseInt(br.readLine());
				student = new Student(name, surname, gpa, s, grant, year);
			} else {
				student = new Student(name, surname, s, grant);
			}
			if (!Admin.getInstance().allStudents.contains(student)) {
				Admin.getInstance().allStudents.add(student);
				System.out.println("Student " + student.getFullName() + " was succesfully added to the datebase.");
			} else
				System.out.println("This student is already added");
			System.out.println("Tap 1 to add another student\nTap 2 to do another operarion");
			int operation = Integer.parseInt(br.readLine());
			if (operation == 2)
				break;
		}
	}

	static void addTeacher() throws IOException {
		while (true) {
			System.out.println("Enter new teacher's full name(first name and last name):");
			String name = br.readLine();
			String surname = br.readLine();
			System.out.println("Enter teacher's salary:");
			int salary = Integer.parseInt(br.readLine());
			System.out.println("Enter teacher's rank:");
			for (int i = 0; i < Rank.values().length; i++) {
				System.out.println((i + 1) + ") " + Rank.values()[i]);
			}
			Rank rank = Rank.values()[Integer.parseInt(br.readLine()) - 1];
			System.out.println("Enter teacher's education degree:");
			for (int i = 0; i < EducationDegree.values().length; i++) {
				System.out.println((i + 1) + ") " + EducationDegree.values()[i]);
			}
			EducationDegree degree = EducationDegree.values()[Integer.parseInt(br.readLine()) - 1];
			System.out.println("Select teacher's faculty:");
			int i = 0;
			for (Faculty f : Admin.getInstance().allFaculties) {
				i++;
				System.out.println(i + " " + f.name);
			}
			int faculch = Integer.parseInt(br.readLine());
			if (faculch == 0)
				break;
			i = 0;
			Faculty f = Admin.getInstance().allFaculties.get(faculch - 1);
			Teacher teacher = new Teacher(name, surname, salary, rank, degree, f);
			if (!Admin.getInstance().allTeachers.contains(teacher)) {
				Admin.getInstance().allTeachers.add(teacher);

				System.out.println("Teacher " + teacher.getFullName() + " was succesfully added to the datebase.");
			} else
				System.out.println("This teacher is already added");
			System.out.println("Tap 1 to add another teacher\nTap 2 to do another operarion");
			int operation = Integer.parseInt(br.readLine());
			if (operation == 2)
				break;
		}
	}

	static void addManager() throws IOException {
		while (true) {
			System.out.println("Enter new managers's full name(first name and last name):");
			String name = br.readLine();
			String surname = br.readLine();
			System.out.println("Enter manager's salary:");
			int salary = Integer.parseInt(br.readLine());
			System.out.println("Enter manager's office:");
			for (int i = 0; i < ManagerTypes.values().length; i++) {
				System.out.println((i + 1) + ") " + ManagerTypes.values()[i]);
			}
			ManagerTypes type = ManagerTypes.values()[Integer.parseInt(br.readLine()) - 1];
			Manager manager = new Manager(name, surname, salary, type);
			if (!Admin.getInstance().allManagers.contains(manager)) {
				Admin.getInstance().allManagers.add(manager);
				System.out.println("Manager " + manager.getFullName() + " was succesfully added to the datebase.");
			} else
				System.out.println("This teacher is already added");
			System.out.println("Tap 1 to add another manager\nTap 2 to do another operarion");
			int operation = Integer.parseInt(br.readLine());
			if (operation == 2)
				break;
		}
	}

	static void addExecutor() throws IOException {
		while (true) {
			System.out.println("Enter new executor's full name(first name and last name):");
			String name = br.readLine();
			String surname = br.readLine();
			System.out.println("Enter executor's salary:");
			int salary = Integer.parseInt(br.readLine());
			Executor executor = new Executor(name, surname, salary);

			if (!Admin.getInstance().allExecutors.contains(executor)) {
				Admin.getInstance().allExecutors.add(executor);
				System.out.println("Manager " + executor.getFullName() + " was succesfully added to the datebase.");
			} else
				System.out.println("This executor is already added");
			System.out.println("Tap 1 to add another executor\nTap 2 to do another operarion");
			int operation = Integer.parseInt(br.readLine());
			if (operation == 2)
				break;
		}
	}

	static void addCourse() throws IOException {
		while (true) {
			System.out.println("Enter new course's name:");
			String name = br.readLine();
			System.out.println("Select faculty from the list below");
			for (int i = 0; i < Admin.getInstance().allFaculties.size(); i++) {
				System.out.println((i + 1) + Admin.getInstance().allFaculties.get(i).getName());
			}
			Faculty f = Admin.getInstance().allFaculties.get(Integer.parseInt(br.readLine()) - 1);
			System.out.println("Enter number of credits of this course:");
			int credits = Integer.parseInt(br.readLine());
			Course course = new Course(name, f, credits);
			System.out.println("Select teachers of this course:");
			for (int i = 0; i < Admin.getInstance().allTeachers.size(); i++) {
				System.out.println((i + 1) + Admin.getInstance().allTeachers.get(i).getName() + " "
						+ Admin.getInstance().allTeachers.get(i).getFullName());
			}
			Integer inp = 160000;

			while (inp != 0) {
				System.out.println("Select teacher or tap 0 to end input");
				inp = Integer.parseInt(br.readLine());
				if (inp == 0)
					break;
				course.teachers.add(Admin.getInstance().allTeachers.get(inp - 1));
			}

			if (!Admin.getInstance().allCourses.contains(course)) {
				Admin.getInstance().allCourses.add(course);
				System.out.println("Course " + name + " was succesfully added.");
			} else
				System.out.println("This course is already added");
			System.out.println("Tap 1 to add another course\nTap 2 to do another operarion");
			int operation = Integer.parseInt(br.readLine());
			if (operation == 2)
				break;

		}
	}

	static void addTextbook() throws IOException {
		while (true) {
			System.out.println("Enter new textbook's name and it's format:");
			String name = br.readLine();
			String format = br.readLine();
			System.out.println("Enter new textbook's ISBN");
			String ISBN = br.readLine();
			System.out.println("Enter new textbook's author");
			String author = br.readLine();
			Textbook textbook = new Textbook(name, format, ISBN, author);
			if (!Admin.getInstance().allTextbooks.contains(textbook)) {
				Admin.getInstance().allTextbooks.add(textbook);
				System.out.println("Textbook " + name + " was succesfully added.");
			} else
				System.out.println("This textbook is already added");
			System.out.println("Tap 1 to add another course\nTap 2 to do another operarion");
			int operation = Integer.parseInt(br.readLine());
			if (operation == 2)
				break;
		}
	}

	// Student mode
	static void ViewCourses(Student s) throws NumberFormatException, IOException {
		System.out.println("Below is a list of courses of student " + s.toString());
		System.out.println(s.viewCourses());

	}

	static void ViewCourseTextbooks(Course c) throws NumberFormatException, IOException {
		System.out.println("Textbooks and files of the course " + c.getName());
		Integer choice = 16000;
		while (choice != 0) {
			System.out.println("Tap index of the file or 0 to exit from ViewFileMenu");
			for (int i = 0; i < c.files.size(); i++) {
				System.out.println((i + 1) + ") " + c.files.get(i));
			}
			choice = Integer.parseInt(br.readLine());
			if (choice == 0)
				break;
			File file = c.files.get(choice - 1).file;
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s = "", line = null;
			while ((line = in.readLine()) != null) {
				s = s + "\n" + line;
			}
			System.out.println(s);
		}
	}

	static void RegisterForCourse(Student s) throws NumberFormatException, IOException {
		Vector<Course> registered = new Vector<Course>();
		int credits = 0;
		System.out.println("Below is a list of available courses:");
		for (int i = 0; i < Admin.getInstance().allCourses.size(); i++) {
			System.out.println((i + 1) + ") " + Admin.getInstance().allCourses.get(i));
		}
		while (true) {
			System.out.println("Select course to register or tap 0 to exit from registration menu");
			int choice = Integer.parseInt(br.readLine());
			if (choice == 0)
				break;
			Course c = Admin.getInstance().allCourses.get(choice - 1);
			// if(c.getFaculty().specializations.contains(s.getSpecialization()) &&
			if (s.numOfCredits + c.getCredits() <= 21) {

				System.out.println("Selected course is: " + c.getName());
				System.out.println("Now select teacher of the course:");
				for (int i = 0; i < c.teachers.size(); i++) {
					System.out.println((i + 1) + ") " + c.teachers.get(i).getFullName());
				}

				int teacherChoise = Integer.parseInt(br.readLine());
				if (teacherChoise == 0)
					break;
				Teacher t = c.teachers.get(teacherChoise - 1);
				s.addCourse(c, t);
				// s.teachers.put(c,c.teachers.get(teacherChoise-1) );
				s.numOfCredits = s.numOfCredits + c.getCredits();
				Manager.registration.put(s, c);
				// добавить класс группа , проверять сколько чел зарегистрировано
				if (s.numOfCredits == 21)
					break;
			} else {
				System.out.println("You cannot register to the course " + c.getName());
			}
		}
	}

	static void viewStudentMarks(Student s) {
		System.out.println(s.viewMarks());
	}

	static void viewStudentTranscript(Student s) {
		System.out.println(s + "\nTranscript:");
		System.out.println(s.transcript);
	}

	static void ViewTeachersAndRate(Student s) throws NumberFormatException, IOException {
		System.out.println("Below is a list of teachers :");
		int i = 0;
		Vector<Teacher> v = (Vector<Teacher>) s.teachers.values();
		Integer choice = null;
		while (choice != 0) {
			System.out.println(" Select teacher to rate or tap 0 to exit");
			for (Teacher t : v) {
				i++;
				System.out.println(i + " " + t.getFullName());
			}

			choice = Integer.parseInt(br.readLine());
			if (choice == 0)
				break;
			Teacher t = v.get(choice - 1);
			System.out.println(t);
			System.out.println(" Please rate teacher from 0 to 100");
			int rating = Integer.parseInt(br.readLine());
			s.rateTeacher(t, rating);

		}
	}

	// Teacher mode
	static void viewCourses(Teacher t) {
		Vector<Course> v = t.viewCourses();
		System.out.println("Below is all courses of teacher " + t.getFullName());
		for (Course c : v) {
			System.out.println(c.getName());
		}
	}

	static void manageCourseFiles(Teacher t) throws NumberFormatException, IOException {
		Integer filech = null;
		while (filech != 0) {
			System.out.println("Tap 1 to add new files \nTap2 to delete files");

			filech = Integer.parseInt(br.readLine());
			if (filech == 1) {
				System.out.println("Please enter file's name and format ");
				String filename = br.readLine();

				File f = new File(filename);
				if (f.createNewFile()) {
					MyFiles doc = new MyFiles(f);
					if (filename.equals("syllabus.txt") || filename.equals("Syllabus")) {
						t.setSyllabus(doc);
						System.out.println("Syllabus was successfully added!");
					} else {
						t.addFiles(doc);
						System.out.println("File was successfully added!");
					}
				}
			} else if (filech == 2) {
				int h = 0;
				System.out.println("Select file to delete:");
				for (MyFiles mf : t.library) {
					h++;
					System.out.println(h + ")" + mf);
				}
				int delch = Integer.parseInt(br.readLine());
				// t.library.remove(delch-1);
				t.deleteFiles(delch - 1);
				System.out.println("File " + t.library.get(delch - 1) + " was succesfully deleted");
			} else
				break;
		}
	}

	static void putMarks(Teacher t) throws NumberFormatException, IOException {
		viewCourses(t);
		Vector<Course> v = t.viewCourses();
		System.out.println("Select course: ");
		int h = Integer.parseInt(br.readLine());
		Course c = v.get(h - 1);
		Integer studch = 1600;
		while (studch != 0) {
			viewStudents(t, c);
			Vector<Student> vs = t.viewStudents(c);
			System.out.println("Select student or tap 0 to exit Marks Menu");
			studch = Integer.parseInt(br.readLine());
			if (studch == 0)
				break;
			Student s = vs.get(studch - 1);
			System.out.println("Selected student is: " + s.getFullName() + "\nNow enter the mark:");
			int m = Integer.parseInt(br.readLine());
			t.putMark(c, s, m);
			System.out.println("Mark was put succesfully!");
		}
	}

	static void viewStudents(Teacher t, Course c) {
		Vector<Student> v = t.viewStudents(c);
		System.out.println("Below is list of all students of the course : " + c.getName());
		for (Student s : v) {
			System.out.println(s.getFullName());
		}
	}

	// Manager mode
	static void assignCourseToTeacher(Manager m) throws NumberFormatException, IOException {
		System.out.println("Select faculty of the course or tap 0 to exit");
		while (true) {
			System.out.println("Select faculty of the course or tap 0 to exit");
			int i = 0;
			for (Faculty f : Admin.getInstance().allFaculties) {
				i++;
				System.out.println(i + " " + f.name);
			}
			int faculch = Integer.parseInt(br.readLine());
			if (faculch == 0)
				break;
			i = 0;
			Faculty f = Admin.getInstance().allFaculties.get(faculch - 1);

			for (Course c : Admin.getInstance().allCourses) {
				if (c.getFaculty().equals(f)) {
					i++;
					System.out.println(i + " " + c.getName());
				}
			}
			System.out.println("Select the course or tap 0 to exit");
			faculch = Integer.parseInt(br.readLine());
			Course c = Admin.getInstance().allCourses.get(faculch - 1);
			System.out.println("Selected course is: " + c + "\nNow select the teacher to assign");
			i = 0;
			for (Teacher t : Admin.getInstance().allTeachers) {
				if (t.faculty.equals(f)) {
					i++;
					System.out.println(t.getFullName());
				}
			}
			faculch = Integer.parseInt(br.readLine());
			if (faculch == 0)
				break;
			Teacher t = Admin.getInstance().allTeachers.get(faculch - 1);
			m.assignCourseToTeacher(c, t);
			System.out.println("Teacher " + t.getFullName() + " was assigned to the course " + c.getName());
		}
	}

	static void approveRegistration(Manager m) {
		m.approveStudentRegistration();

	}

	static void printAcademicReport(Manager m) {
		for (Course c : Admin.getInstance().allCourses) {
			System.out.println("Academic report for the course " + c.getName());
			System.out.println(m.writeReport(c));
		}
	}

	static void writeDepartmentNews(Manager m) throws IOException {
		System.out.println("Enter announcement title: ");
		String title = br.readLine();
		String content = "";
		System.out.println("Write content.At the end of the input enter END");
		while (true) {
			String cc = br.readLine();
			if (!cc.equals("END")) {
				content = content + cc + "\n";
			} else
				break;
		}
		m.writeDepartmentNews(title, content);
		System.out.println("Announcement was added!");
	}
	// Executor mode

	static void viewAcceptedOrders(Executor e) throws NumberFormatException, IOException, InterruptedException {
		System.out.println("Below are list of accepted orders:");
		System.out.println(e.viewAcceptedOrders());
		Integer choice = null;
		while (true) {
			System.out.println("Select order or tap 0 to exit menu");
			choice = Integer.parseInt(br.readLine());
			if (choice == 0)
				break;
			Order o = Admin.getInstance().allOrders.get(choice - 1);
			if (e.acceptOrder(o)) {
				System.out.println("Order " + o.toString() + " is accepted");
				Thread.sleep(5000);
				System.out.println("Order " + o.toString() + " is done");
				e.addExecutedOrder(o);
			} else {
				System.out.println("Order " + o.toString() + " is not accepted");
			}
		}

	}
	static void viewAnnouncements() throws NumberFormatException, IOException {
		int i=0;
		LocalDateTime ld =LocalDateTime.now();
		System.out.println("Announcements:  	      Date: "+ld);
		for(Announcement a:Admin.getInstance().allAnnouncements) {
			i++;
			System.out.println(i+") "+ a.getTitle());
			System.out.println(a.content+"\n");
		}
		
		Integer ch=null;
		while(true) {
			System.out.println("Select announcement is you want to write comment or tap 0 to exit");
				ch = Integer.parseInt(br.readLine());
				if(ch==0) break;
				Announcement a=Admin.getInstance().allAnnouncements.get(ch-1);
				System.out.println(a.comments.size()+" comments :");
				for(String s:a.comments) {
					System.out.println(s);
				}
				System.out.println("Write:");
				String comment = "";
				while (true) {
					String cc = br.readLine();
					if (!cc.equals("END")) {
						comment = comment + cc + "\n";
					} else
						break;
				}
				a.comments.add(comment);
		}
	
	}
	public static void main(String[] args)
			throws IOException, ClassNotFoundException, NumberFormatException, InterruptedException {
		
		

	}
}

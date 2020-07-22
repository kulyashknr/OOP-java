package d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;

public class Login implements viewGenerealInfo {

static String semester = "Fall";
 User user;




public void continueAsGuest() {
}

public void viewFaculties() {
	System.out.println("Below is the list of University faculties");
	for(Faculty f:Admin.getInstance().allFaculties)
		System.out.println(f);
}


@Override
public void viewTeachersOfTheFaculty(Faculty f) {
	for(Teacher t: f.teachers) {
		System.out.println(t);
	}
}

@Override
public void viewLibrary() {
	System.out.println("University library contains"+Admin.getInstance().allTextbooks.size()+" books");
	for(Textbook t:Admin.getInstance().allTextbooks)
		System.out.println(t);
	
}

@Override
public void viewCoursesOfTheFaculty(Faculty f) {
	System.out.println("Teachers of the "+f.getName()+":");
	for(Course c: Admin.getInstance().allCourses)
		System.out.println(c);
	
}
static boolean isUser(String login, String password) {
	Integer hashPassword = password.hashCode();

	if(Admin.getInstance().allPasswords.containsKey(login) &&
			Admin.getInstance().allPasswords.get(login).equals(hashPassword)) return true;
	return false;	
}



public static void main(String[] args) throws ClassNotFoundException, IOException {
/*	Teacher t = new Teacher("Catherine","Johnson",2,Rank.AssistantLecturer,EducationDegree.Master);
	Admin.getInstance().allTeachers.add(t);
	Admin.getInstance().serializeUser();
	Admin.getInstance().initializeObjects();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String login = br.readLine();
	String password = br.readLine();
	System.out.println((isUser(login,password)));
	
*/	
}
}
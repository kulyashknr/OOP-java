package Problem2;

import java.io.Serializable;

public class Course implements Serializable {
	String courseTitle;
	Textbook textbook;
	Instructor instructor;
	
	public Course () {
		this.courseTitle = null;
		this.textbook = null;
		this.instructor = null;
	}
	
	public Course (String courseTitle, Textbook textbook, Instructor instructor) {
		this.courseTitle = courseTitle;
		this.textbook = textbook;
		this.instructor = instructor;
	}
	
	public String getTitle() {
		return courseTitle;
	}
	
	public void setTitle(String courseTitle) {
		courseTitle = this.courseTitle;
	}
	
	public String toString() {
		return getTitle() + " " + "'" + textbook.getTitle() + "'" + " " + instructor.getFirstName() + " " + instructor.getLastName();
	}
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof Course))  {
			return false;
		}
		
		Course b = (Course)o;
		return (courseTitle.equals(b.courseTitle));
	}
}
package Problem2;

import java.io.Serializable;

public class Instructor implements Serializable {
    private String email, department, firstName, lastName;

    public Instructor() { 
    		email = null;
    		department = null;
    		firstName = null;
    		lastName = null;
    }
    
    public Instructor (String firstName, String lastName, String department, String email) {
        this.email = email;
        this.department = department;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }   
    
    public String toString () {
        return email + " " + department + " " + firstName + " " + lastName;
    }
    
	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof Instructor))  {
			return false;
		}
		
		Instructor i = (Instructor)o;
		return (email.equals(i.email) && (department.equals(i.department)) & (firstName.equals(i.firstName)));
	}
}

import java.util.HashSet;
import java.util.Set;

class Employee {
	String firstName;
	String lastName;
	
	
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
	@Override
	public String toString() {
		return "Employee [" + firstName + " " + lastName + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
}


public class HashCode {
	
	public static void main(String[] args) {
		
		Set	<Employee> list = new HashSet<>();
		
		Employee e = new Employee();
		e.setFirstName("Kshiteej");
		e.setLastName("Jain");
		list.add(e);
		
		
		e = new Employee();
		e.setFirstName("Kshiteej");
		e.setLastName("ABC");
		list.add(e);
		
		e = new Employee();
		e.setFirstName("Kshiteej");
		e.setLastName("Sharma");
		list.add(e);
		
		e = new Employee();
		e.setFirstName("Ashish");
		e.setLastName("Jain");
		list.add(e);
		
		e = new Employee();
		e.setFirstName("Ashish");
		e.setLastName("Jain");
		list.add(e);
		System.out.println(list);
		
		String orig = "Kshitijk";
		
		char[] s = orig.toCharArray();
	    int n = s.length;
	    int halfLength = n / 2;
	    System.out.println(halfLength);
	    for (int i=0; i<halfLength; i++)
	    {
	        char temp = s[i];
	        s[i] = s[n-1-i];
	        s[n-1-i] = temp;
	    }
	    String s1 =  new String(s);
	    System.out.println(s1);
		
	/*	e = new Employee();
		e.setFirstName("Chayan");
		e.setLastName("Jain");
		list.add(e);
		
		
		e = new Employee();
		e.setFirstName("Umesh");
		e.setLastName("Nikam");
		list.add(e);
		
		e = new Employee();
		e.setFirstName("Rohit");
		e.setLastName("Bhagwat");
		list.add(e);*/
	
	}
}

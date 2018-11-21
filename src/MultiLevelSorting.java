import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1{
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
	
	  
	
	
}

class Sorting implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		int i = o1.firstName.compareTo(o2.firstName);
		//return i;
		if(i!=0){
			return i;
		}
		
		return o1.lastName.compareTo(o2.lastName);
	}
}

public class MultiLevelSorting {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
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
		list.add(e);
		
		Collections.sort(list, new Sorting());
		System.out.println(list);
	}
}


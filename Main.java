import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee [] emp =  { new Employee("J", "Red", 51000, "IT"),
		         new Employee("A", "Green", 71600, "IT"),
		         new Employee("M", "Black", 35187.5, "Sales"),
		         new Employee("K", "Yellow", 47100.77, "Marketing"),
		         new Employee("L", "Pink", 62001, "IT"),
		         new Employee("A", "Blue", 32001, "Sales"),
		         new Employee("W", "Brown", 42361.4, "Marketing")};
		List<Employee> list =  Arrays.asList(emp);
		//list.stream().forEach(System.out::println);
		Function<Employee, String> byFirstName = Employee::getFirstName;
		Function<Employee, String> byLastName = Employee::getLastName;
		Comparator<Employee> lastThenFirst = Comparator.comparing(byFirstName).thenComparing(byLastName);
		System.out.printf(
		         "%nEmployees in ascending order by last name then first:%n");
		      list.stream()
		          .sorted(lastThenFirst)
		          .forEach(System.out::println);
		
		      
		      HashMap<String, Integer> hm
	            = new HashMap<String, Integer>();
	 
	        // enter data into hashmap
	        hm.put("Math", 98);
	        hm.put("Data Structure", 85);
	        hm.put("Database", 91);
	        hm.put("Java", 95);
	        hm.put("Operating System", 79);
	        hm.put("Networking", 80);
	        
	        List<Map.Entry<String, Integer> > list1
            = new LinkedList<Map.Entry<String, Integer> >(
                hm.entrySet());
	        Collections.sort(list1,new Comparator<Map.Entry<String, Integer>>() {

				@Override
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
					// TODO Auto-generated method stub
					return o1.getValue().compareTo(o2.getValue());
				}
			});
	      
		System.out.println(list1);
		System.out.println(hm);

	}

}
class Employee
{
   private String firstName;
   private String lastName;
   private double salary; 
   private String department;
public Employee(String firstName, String lastName, double salary, String department) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
	this.department = department;
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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
   
// return Employee's first and last name combined
public String getName()
{
   return String.format("%s %s", getFirstName(), getLastName());
}

// return a String containing the Employee's information
@Override
public String toString() 
{
   return String.format("%-8s %-8s %8.2f   %s", 
      getFirstName(), getLastName(), getSalary(), getDepartment());
} 
}
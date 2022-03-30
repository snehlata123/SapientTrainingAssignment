package enc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FetchEmp1 {

	public static void main(String[] args) {
		Employee e4 = new Employee(11, "c");
		Employee e1 = new Employee(1, "a");
		Employee e2 = new Employee(2, "b");
		Employee e3 = new Employee(3, "c");
		
		List<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		Collections.sort(al);
		System.out.println(al);

	}

}
class Employee implements Comparable<Employee>{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
}

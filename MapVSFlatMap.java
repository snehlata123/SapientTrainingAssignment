package Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVSFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Customer> customers = 	EkartDB.getAll();
	List<String> emails =customers.stream().map(customer->customer.getEmail()).collect(Collectors.toList());
	System.out.println(emails);
	List<List<String>> phones =customers.stream().map(customer->customer.getPhone()).collect(Collectors.toList());
	System.out.println(phones);
	List<String> phonesFlat =customers.stream().flatMap(customer->customer.getPhone().stream()).collect(Collectors.toList());
	System.out.println(phonesFlat);
	}

}


class Customer{
	int id;String email;List<String> phone;String name;




	public Customer(int id, String name,String email, List<String> phone) {
		super();
		this.id = id;
		this.email = email;
		this.phone = phone;
		this.name = name;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public List<String> getPhone() {
		return phone;
	}




	public void setPhone(List<String> phone) {
		this.phone = phone;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
class EkartDB{
	public static List<Customer> getAll(){
		return Stream.of
				(
						new Customer(101,"A","a@a.com",Arrays.asList("1234","2345")),
						new Customer(101,"B","b@a.com",Arrays.asList("12340","23450")),
						new Customer(101,"C","c@a.com",Arrays.asList("12341","23451"))
						)
				.collect(Collectors.toList());
	}
}
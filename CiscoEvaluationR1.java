package GFGprac;

import java.io.IOException;

public class CiscoEvaluationR1 extends Student {

	
	public static void main(String ... args){
		System.out.println("Hi");
	}

	@Override
protected	int calculateActualAge() throws RuntimeException{
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}

class Encaps{
	private String name;
	private  int rollNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Encaps [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
}

abstract class Student{
	int age;
	abstract int calculateActualAge() throws IOException;
	 
	
}


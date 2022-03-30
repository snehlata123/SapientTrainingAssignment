package enc;

import java.util.Arrays;
import java.io.IOException;
import java.util.*;


public class Simple {
	
	public static void main(String[] args) throws InterruptedException{
String s1="Hello";
String s2=new String("Hello");
System.out.println(s1.equals(s2));
StringJoiner joiner = new StringJoiner(",", "[", "]");
joiner.add("Red")
  .add("Green")
  .add("Blue");
	System.out.println(joiner);
	


	String s11 = "Baeldung";
	String s21 = new String("Baeldung");
	String s31 = new String("Baeldung").intern();
	System.out.println(s11 == s21);
	System.out.println(s11 == s31);
	long count = "snehlata".chars().filter(s->s=='s').count();
	StringBuilder s = new StringBuilder("madam");
	System.out.println(s.equals(s.reverse()));
	System.out.println(count);
	
	
	StringBuffer ss1 = new StringBuffer("Hello");
	String ss2 = new String("Hello");
	System.out.println(ss1.equals(ss2));
	}
}

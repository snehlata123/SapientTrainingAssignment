package enc;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;

public class ReadWriteExcel {
	 public static void main(String [] args) {
		String oldValue = "30";
		//int newV = (Integer.parseInt(oldValue) + 5);
		String newV=	Integer.toString(Integer.parseInt(oldValue) + 5);
		
		System.out.println(newV);
	 }



}


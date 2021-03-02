package javaP;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassA3 {
	
	public void getdate() {
		//Date date = new Date();
		String dateTime = new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss").format(new Date());
		System.out.println(dateTime);
		
		
	}
	public static void main(String[] args) {
		
		ClassA3 obj = new ClassA3();
		obj.getdate();
	}

}

package javaP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListEx {
	
	public void listExTest() {
		//Declare a list
		List<String> myL = new ArrayList<String>();
		
		//int[] arr = new int[4];
		
		myL.add("A");
		myL.add("B");
		myL.add("C");
		myL.add("C");
		myL.add("D");
		myL.add("E");
		myL.add("T");
		
		int listSize = myL.size();
		System.out.println(listSize);
		
		System.out.println(myL);
		
		//System.out.println("=============================");
		
		//myL.add(3, "ABC");
		
		//System.out.println(myL.get(4));
		
		//System.out.println(myL);
		
		
	}
	
	public void setExTest() {
		//Declare set
		Set<String> mySet = new HashSet<>();
		mySet.add("A");
		mySet.add("B");
		mySet.add("C");
		mySet.add("C");
		mySet.add("D");
		mySet.add("E");
		mySet.add("T");
		
		System.out.println(mySet.size());
		System.out.println(mySet);
	}
	
	public static void main(String[] args) {
		ListEx obj = new ListEx();
		obj.listExTest();
		obj.setExTest();
	}

}

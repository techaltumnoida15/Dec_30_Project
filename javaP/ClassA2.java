package javaP;

public class ClassA2 {
	//Constructor
	/*
	 * * Constructor: is a special method, which execute automatically when object is created.
	 * 1. Its name must be same as class name
	 * 2. It does not have any return type, not even void
	 */
	
	public ClassA2() { 
		System.out.println("Java"); 
	}
	 
	public ClassA2(String s) {
		System.out.println(s);
	}
	
	public void method1() {
		System.out.println("C#");
	}
	
	public void evenOdd(int t) {
		if(t%2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}

	public void primeNum(int t) {
		
		int flag = 0;
		
		for(int i = 2; i<=t; i++) {
			if(t/i == 0) {
				flag++;
			}
		}
		
		if(flag == 1) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

	public void calcFact(int t) {
		int fact = 1;
		
		if(t == 0) {
			System.out.println("Fact is 1.");
		}
		else {
			for(int i = t; i>=1; i--) {
				fact = fact * i;
			}
			
			System.out.println("Fact is = " + fact);
		}
	}
	
	public static void main(String[] args) {   //U will start from here
		ClassA2 obj = new ClassA2();
		//obj.evenOdd(5);
		//obj.primeNum(3);
		obj.calcFact(5);
	}
}

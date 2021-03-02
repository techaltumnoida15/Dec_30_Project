package javaP;

public class ClassA1 {

	int i = 0;
	
	public void method1() {
		
		System.out.println("Hi");
	}
	
	String s = "Hello";
	
	public void method2() {
		System.out.println("Java");
	}
	
	public void method2(String s) {
		System.out.println(s);
	}
	
	public void method2(String s, int t) {
		
	}
	//If there are two or more methods with same name in a class then it is known as method overloading. It happens in same class.
	
	/*U must have a main method
	 * 
	 * Create object of this class
	 * 
	 * call any method of class with the help of object
	 * 
	 */
	
	public int method3(int t1, int t2) {
		return t1 + t2;
	}
	
	public String method4(String s1, String s2) {
		return s1 + s2;
	}
	
	public static void main(String[] args) {    //Compiler will come here - main method
		//ClassName objName = new ClassName();
		
		ClassA1 obj = new ClassA1();
		//obj.method1();
		/*
		 * int result = obj.method3(3, 4); System.out.println(result);
		 */
		
		String result1 = obj.method4("Nitin", "Noida");
		System.out.println(result1);
	}
	
	public static void main(int t) {
		ClassA1 obj = new ClassA1();
		
		String result1 = obj.method4("Nitin", "Noida");
		System.out.println(result1);
	}
}

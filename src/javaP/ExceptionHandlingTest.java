package javaP;

public class ExceptionHandlingTest {

	public void method1() throws Exception{
		int t = 10;
		
		int h = t/0;
	}
	
	public static void main(String[] args) throws Exception {
		ExceptionHandlingTest obj = new ExceptionHandlingTest();
		obj.method1();
	}
}

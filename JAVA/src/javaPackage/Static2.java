package javaPackage;

public class Static2 {
	int roll;//Declaring global variable
	String name;
	String college;

	public static void main(String[] args) {
	Static2 s2 = new Static2();//creating an object for non static member
	System.out.println(s2.roll);
	System.out.println(s2.name);
	System.out.println(s2.college);
	
	}

}

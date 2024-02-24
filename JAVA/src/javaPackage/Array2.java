package javaPackage;

public class Array2 {

	public static void main(String[] args) {
		
		//We can write array in below fashion as well
		int b[] = {1, 2, 3, 4, 5};//Defining an int array
		
		String s[] = {"hi", "hello"}; //defining an string array
		
		Object a[] = {1, 2, 3, 4, 5, "Selenium", 6, 6.5};//Defining an object array
	
	System.out.println(a.length);
	System.out.println(b.length);
	System.out.println(s.length);
	
	System.out.println(a[5]);
	System.out.println(b[4]);
	System.out.println(s[1]);
	
	a[5] = "AUTOMATION";//modifying an array
	System.out.println(a[5]);
	}

}
 
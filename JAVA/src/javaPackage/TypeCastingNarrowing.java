package javaPackage;

public class TypeCastingNarrowing {

	public static void main(String[] args) {
		
		//Double to Integer Conversion
		double b = 5.9;
		
		int a  = (int) b;//manual casting double to int
		
		System.out.println(b);//5.9
		
		System.out.println(a);//5
		
		//String to Integer Conversion
		
		String s = "10";
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		//Integer to String Conversion
		
		int z = 5;
		String t = String.valueOf(z);
		System.out.println(t.length());///1
		System.out.println(t);//5
		
		
		
	}
}

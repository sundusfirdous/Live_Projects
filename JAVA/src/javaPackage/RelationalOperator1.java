package javaPackage;

public class RelationalOperator1 {

	public static void main(String[] args) {
		int a = 300;
		int b = 300;
		
		if (a != b)
		{
			System.out.println("a is not equal to b");
			
		} else {
			
			System.out.println("a is equal to b");
		}
		
		String p = "Hello";
		String q = "hello";
		
		//String Comparison - 1st way
		if (p == q)
		{
			System.out.println("p and q are equal for 1st way");
		} else
		{
			System.out.println("p and q are not equal for 1st way");
		}

		//String Comparison - 2nd way
	    if (p.equals(q))
		{
		System.out.println("p and q are equal for 2nd way");
		} else
		{
		System.out.println("p and q are not equal for 2nd way");
		}
	    
	  //String Comparison - 3rd way
	    if (p.equalsIgnoreCase(q))
		{
		System.out.println("p and q are equal for 3rd way");
		} else
		{
		System.out.println("p and q are not equal for 3rd way");
		}
	}

}

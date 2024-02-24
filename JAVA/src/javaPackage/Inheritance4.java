package javaPackage;

public class Inheritance4 extends Inheritance3{

	
		
		public void multiply(int x , int y)
		{
			z =  x * y;
			System.out.println("Product is : " + z);
			
		}
		public static void main(String[] args) {
			
			int x = 20 , y = 10;
			 Inheritance4 i4 = new Inheritance4();
			 i4.add(x , y);
			 i4.subtract(20, 15);
			 i4.multiply(x, y);
		
	}

}

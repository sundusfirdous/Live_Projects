package javaPackage;

public class UnaryOperator2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		System.out.println(a++);//10,11
		System.out.println(a++ + a++);//11,12,12,13  = 23
		System.out.println(a + a );//13+13=26
		System.out.println(a + a++);//13,13,14=26
		System.out.println(b++ + b--);//10,11,11,10=21
		System.out.println(b++ + b--);//10,11,11,10=21
		System.out.println(b);//10

	}

}

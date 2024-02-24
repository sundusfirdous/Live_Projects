package javaPackage;

public class UnaryOperator3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		System.out.println(a++);//10,11=10
		System.out.println(a++ + ++a);//11,12,13,13=24
		System.out.println(b++ + ++b);//10,11,12,12=22
		System.out.println(b++ + b++);//12,13,13,14=25
		System.out.println(b);//14
		System.out.println(a++ + b++);//13,14,14,15=27

	}

}

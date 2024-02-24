package javaPackage;

public class Variable3 {
	int data = 50;//global variable
	static int f = 5;//static variable
	public static void main(String[] args) {
		System.out.println(f);
		m1();
		Variable3 v3=new Variable3();
		v3.a();
		System.out.println(v3.data);
		System.out.println(k);
	}
	public static void m1() {
		int n=5;
		System.out.println(n);
	}
	static int k=7;
	
	//user defined method
	public void a()
	{
		int a  = 100;//Local variable
		System.out.println(a);
	}
	
}


package javaPackage;

public class Variable8 {
	int b= 10;
	static int c=5;

	public static void main(String[] args) {
	int a = 6;//local variable
	System.out.println(a);//6
	
	//static member calling
	System.out.println(c);
	d();
	System.out.println(Variable8.c);
	Variable8.d();
	
	//Non Static Member Calling
	
	Variable8 v8 = new Variable8();
	System.out.println(v8.b);//10
	
	}
	public static void d()
	{
		int e = 15;
		System.out.println(e);
	}
	public void f()
	{
		int g = 5;
		System.out.println(g);//5
	}
	

}

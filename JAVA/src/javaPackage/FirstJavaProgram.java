package javaPackage;

public class FirstJavaProgram {
int a=5; //Global Variable
static int c = 10; //static variable
	public static void main(String[] args) {
		System.out.println("Hello Friends");
	aMethod();
	bMethod();
	int b = 15;
	System.out.println(b);
	System.out.println(c);
	FirstJavaProgram f1 = new FirstJavaProgram();
	System.out.println(f1.a);
	}
public static void aMethod()

	{
	System.out.println("Hello aMethod");
	
	}
public static void bMethod()
{
	System.out.println("Hello bMethod");
	}
	}



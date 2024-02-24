package javaPackage;

public class Interface2 implements Interface1{
	
	public void a()
	{
		System.out.println("a method");
	}

	public void b()
	{
		System.out.println("b method");
	}

	public static void main(String[] args) {
		
Interface2 i2 = new Interface2();
i2.a();
i2.b();
	}

}

package javaPackage;

public class Encapsulation1 {

	String name;
	int b;
	final int c = 2;
	
	public void a()
	{
		//c = 5; //final variable can not change the value
	}
	
	//final method
	final void d()//final method can be overloaded
	{
		System.out.println("final method");
	}
	
	public void setName(String s)
	{
		this.name = s;
		this.b = 5;
		System.out.println(b);
		System.out.println(c);
		
	}
	public String getName()
	{
		return name;
	}
}

package javaPackage;

public class Static6 {
	int x = 10;
	static int y = 5;
	
	//non static method
	public void a()
	{
		
		int z = 10;
		System.out.println(z);
	}
	static int b = 6;
	
	public static void b()
	{
		int a  = 5;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Static6 s6 = new Static6();
		s6.a();
		System.out.println(s6.b);//inappropriate way
		System.out.println(Static6.b);//inappropriate way
		System.out.println(b);//correct way
		b();//correct way
	}

}

package javaPackage;

public class Static7 {
String a;
int b;
static int c=4;

//static method
public static void a()
{
System.out.println("Hello Static");	
}
	public static void main(String[] args) {
		Static7 s7 = new Static7();
		
		s7.a = "Selenium";
		s7.b = 1;
		c=2;
		a();
		System.out.println(s7.a + " " + s7.b + " " + c);
		
		 int j = 5;
		 j=j;//Initialisation with same variable
		 System.out.println(j);

	}

}

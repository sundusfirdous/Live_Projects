package javaPackage;

public class MethodOverride2 extends MethodOverride1 {
public void eat()
{
System.out.println("You are eating");	
}
public static void main(String[] args) {
	MethodOverride2 mo2 = new MethodOverride2();
	mo2.eat();
	//mo2.a=10;
	
}
}
